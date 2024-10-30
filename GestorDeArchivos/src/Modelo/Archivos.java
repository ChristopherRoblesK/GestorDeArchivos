package Modelo;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Importación para utlizar JaudioTager
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.TagException;

//importación para poder utlizar textfield
import javax.swing.JTextField;

public class Archivos {
   private File[] archivo;
   private File directorio;
   
   public Archivos(File[] archivo){
       this.archivo = archivo;
   }
   
   //Métodos Getters
    public File[] getArchivo() {
        return archivo;
    }
    public File getDirectorio(){
        return directorio;
    }
   //Métodos Setters
    public void setArchivo(File[] archivo) {
        this.archivo = archivo;
    }
    public void setDirectorio(File directorio){
        this.directorio = directorio;
    }
    
    //Método para recorrer los archivos y allar el tamaño total
    public double tamanioArchivos(File[] archivo, String[] extensiones){
        double tamanioTotal = 0;
        
        for(File archivo1 : archivo){
            if(archivo1.isDirectory()){
                tamanioTotal += calcularTamanioCarpeta(archivo1, extensiones);
            }
            else{
                for(String extension : extensiones){
                    if(archivo1.getName().endsWith(extension)){
                        tamanioTotal += archivo1.length();
                        break; //No se necesita recorrer más extensiones
                    }
                }
            }
        }
        
        return tamanioTotal;
    }
    
    
    // Método recursivo para calcular el tamaño total de un directorio o carpeta
    public double calcularTamanioCarpeta(File directorio, String[] extensiones){
        double tamanio = 0;
        File[] archivos = directorio.listFiles();//Obtener los archivos dentro del directorio
        
        if(archivos != null){
            for(File archi : archivos){
                if(archi.isDirectory()){
                    tamanio += calcularTamanioCarpeta(archi, extensiones);// Llamada recursiva si es un subdirectorio
                }
                else{
                    for(String extension : extensiones){
                        if(archi.getName().endsWith(extension)){
                            tamanio += archi.length();// Sumar tamaño del archivo
                            break;
                        }
                    }
                    
                }
            }
        }
        
        return tamanio;
    }
    
    //Método para Encontrar Archivos
    public long contarArchivo(File directorio, String[] extensiones){
       long contador = 0;
       File[] archiv = directorio.listFiles();
       
       if(archiv != null){
           for(File archi : archiv){
               if(archi.isFile()){
                   for(String extension : extensiones){
                       if(archi.getName().endsWith(extension)){
                           contador++;
                       }
                   }
               }else if(archi.isDirectory()){
                   contador += contarArchivo(archi, extensiones);
               }
           }
       }
       return contador;
    }
    
    //Método para ver el tamaño de los duplicados
   public double tamanioArchivosDuplicados(File directorio, String[] extensiones){
       //HashMap para almacenar el nombre del archivo  y una lista de las veces que está repetido
       HashMap<String, List<File>> mapaArchivo = new HashMap<>();
       
       // Llamamos al método recursivo para llenar el mapa de archivos duplicados
        procesarArchivosD(directorio, mapaArchivo, extensiones);
        
        double totalTamanioDup = 0;
        // Comprobar qué archivos están duplicados y sumar su tamaño
        for (Map.Entry<String, List<File>> entrada : mapaArchivo.entrySet()) {
            List<File> listaArchivo = entrada.getValue();
            if (listaArchivo.size() > 1) {
                // Solo sumar el tamaño de los archivos duplicados (se omite el primero)
                for (int i = 1; i < listaArchivo.size(); i++) {
                    totalTamanioDup += listaArchivo.get(i).length();
                }
            }
        }

        return totalTamanioDup;
   } 
   
   //Método para ver la cantidad de duplicados
   public long archivosDuplicados(File directorio, String[] extensiones){
       //HashMap para almacenar el nombre del archivo  y una lista de las veces que está repetido
       HashMap<String, List<File>> mapaArchivo = new HashMap<>();
       
       // Llamamos al método recursivo para llenar el mapa de archivos duplicados
        procesarArchivosD(directorio, mapaArchivo, extensiones);
        
        long cantidadDup = 0;
        // Comprobar qué archivos están duplicados
        for (Map.Entry<String, List<File>> entrada : mapaArchivo.entrySet()) {
            List<File> listaArchivo = entrada.getValue();
            if (listaArchivo.size() > 1) {
                // Solo cuenta los archivos que son duplicados (se omite el primero)
                cantidadDup += listaArchivo.size() - 1;
        }
    }
    return cantidadDup;
   }
   
    private void procesarArchivosD(File directorio, HashMap<String, List<File>> mapaArchivo, String[] extensiones) {
        File[] archiv = directorio.listFiles();
    
        if (archiv != null) {
            for (File archi : archiv) {
                if (archi.isFile()) {
                    for(String extension : extensiones){
                        if(archi.getName().endsWith(extension)){
                            String nomArchivo = archi.getName();
                            // Añadir el archivo al mapa, agrupando por nombre de archivo
                            mapaArchivo.computeIfAbsent(nomArchivo, k -> new ArrayList<>()).add(archi);
                            break;
                        }
                    }
                } else if (archi.isDirectory()) {
                    // Llamada recursiva para procesar subdirectorios
                    procesarArchivosD(archi, mapaArchivo, extensiones);
                }
            }
        }
    }
    
    //Método para mostrar los archivos en el JTable de musica
    public void mostrarArchivosMusica(File directorio, DefaultTableModel modeloT, String[] extensiones){
        File[] archiv = directorio.listFiles();
        
        if(archiv != null){
            for(File archi : archiv){
                if(archi.isFile()){
                    for(String extension : extensiones){
                        if(archi.getName().endsWith(extension)){
                            try{
                                AudioFile archivoAudio = AudioFileIO.read(archi);
                                Tag metadatos = archivoAudio.getTag();
                                AudioHeader cabecera = archivoAudio.getAudioHeader();
                                String nombreAudio = archi.getName();
                                String ext = extension;
                                String artista = metadatos != null ? metadatos.getFirst(FieldKey.ARTIST) : "Desconocido";
                                String album = metadatos != null ? metadatos.getFirst(FieldKey.ALBUM) : "Desconocido";
                                String genero = metadatos != null ? metadatos.getFirst(FieldKey.GENRE) : "Desconocido";
                                int duracion = cabecera.getTrackLength();
                                String anio = metadatos != null ? metadatos.getFirst(FieldKey.YEAR) : "N/A";
                                String ruta = archi.getAbsolutePath();
                                double tamanioByte = archi.length();
                                double tamanioMB = tamanioByte / (1024 * 1024);
                                
                                /*
                                // Verificar datos antes de agregar
                                System.out.println("Nombre: " + nombreAudio);
                                System.out.println("Extensión: " + ext);
                                System.out.println("Artista: " + artista);
                                System.out.println("Álbum: " + album);
                                System.out.println("Género: " + genero);
                                System.out.println("Duración: " + duracion);
                                System.out.println("Año: " + anio);
                                System.out.println("Ruta: " + ruta);
                                System.out.println("Tamaño (MB): " + tamanioMB);
                                */
                                
                                Object[] contenedorArchivo = new Object[]{
                                    nombreAudio, ext, artista, album, genero, duracion, anio, ruta, tamanioMB
                                };
                                //System.out.println( "Agregando: " + archi.getName());
                                modeloT.addRow(contenedorArchivo);
                                
                            }catch(HeadlessException | IOException | CannotReadException | InvalidAudioFrameException | ReadOnlyFileException | KeyNotFoundException | TagException e){
                                JOptionPane.showMessageDialog(null, e.toString());
                            }
                            break; // no se siguen verificando otras extensiones
                        }
                    }
                }else{
                    mostrarArchivosMusica(archi, modeloT, extensiones);
                }
            }
        }
    } 
    
    //Método para eliminar canciones
    public void eliminarCanción(JTextField ruta){
        File cancion = new File(ruta.getText());
        if (!cancion.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo no existe.");
            return;
        }
        if (!cancion.canWrite()) {
            JOptionPane.showMessageDialog(null, "No tienes permisos para eliminar este archivo.");
            return;
        }
        if (cancion.delete()) {
            JOptionPane.showMessageDialog(null, "Se eliminó la canción con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la canción.");
        }
    }
}
