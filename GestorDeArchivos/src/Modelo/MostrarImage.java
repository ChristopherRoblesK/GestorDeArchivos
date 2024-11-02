
package Modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MostrarImage extends Archivos {
    
        private String rutaDeImage;
    
     public MostrarImage(File[] archivo) {
        super(archivo);
    }
     
    public void mostrarArchivoImagen(File directorio, DefaultTableModel modeloT, String[] extensiones){
        File[] archiv = directorio.listFiles();
        if(archiv != null){
            for(File archi : archiv){
                if(archi.isFile()){
                    for(String extension : extensiones){
                        if(archi.getName().endsWith(extension)){
                            rutaDeImage = archi.getAbsolutePath();

                            try{
                                
                                String nombre = archi.getName();
                                String ext = extension;
                                String fechaCreacion = "N/A";
                                String fechaModificacion = "N/A";
                                double tamanioByte = archi.length();
                                double tamanioMB = tamanioByte / (1024 * 1024);
                                String espacioImg = String.format("%.2f MB" , tamanioMB);
                                String aparato = "N/A";
                                String modelo = "N/A";
                                
                                // Obtener fechas de creación y modificación usando BasicFileAttributes
                               BasicFileAttributes atributos = Files.readAttributes(archi.toPath(), BasicFileAttributes.class);
                               LocalDateTime fechaCreacionLocal = LocalDateTime.ofInstant(atributos.creationTime().toInstant(), ZoneId.systemDefault());
                               LocalDateTime fechaModificacionLocal = LocalDateTime.ofInstant(atributos.lastModifiedTime().toInstant(), ZoneId.systemDefault());
                               DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                               
                               fechaCreacion = fechaCreacionLocal.format(formato);
                               fechaModificacion = fechaModificacionLocal.format(formato);
                                
                                Object[] contenedorArchivo = new Object[]{
                                    nombre, ext, rutaDeImage, fechaCreacion, fechaModificacion, espacioImg, aparato, modelo
                                };
                                modeloT.addRow(contenedorArchivo);
                            }catch(IOException e){
                                JOptionPane.showMessageDialog(null, e.toString());
                            }
                            break; // no se siguen verificando otras extensiones
                        }
                    } 
                }else{
                    mostrarArchivoImagen(archi, modeloT, extensiones);
                }
            }
        }
    }
    
        public void mostrarImgDup(File directorio, DefaultTableModel modeloT, String[] extensiones) {
            HashMap<String, List<File>> mapaArchivo = new HashMap<>();
            procesarArchivosD(directorio, mapaArchivo, extensiones);
            for(Map.Entry<String, List<File>> entrada : mapaArchivo.entrySet()) {
                List<File> listaArchivo = entrada.getValue();
                if(listaArchivo.size() > 1) { // Solo archivos duplicados
                    if(listaArchivo.size() > 1) {
                        File archivoDuplicado = listaArchivo.get(0);
                        rutaDeImage = archivoDuplicado.getAbsolutePath();
                        try{
                                
                            String nombre = archivoDuplicado.getName();
                            String ext = getExtension(nombre);
                            String fechaCreacion = "N/A";
                            String fechaModificacion = "N/A";
                            double tamanioByte = archivoDuplicado.length();
                            double tamanioMB = tamanioByte / (1024 * 1024);
                            String espacioImg = String.format("%.2f MB" , tamanioMB);
                            String aparato = "N/A";
                            String modelo = "N/A";
                                
                            // Obtener fechas de creación y modificación usando BasicFileAttributes
                            BasicFileAttributes atributos = Files.readAttributes(archivoDuplicado.toPath(), BasicFileAttributes.class);
                            LocalDateTime fechaCreacionLocal = LocalDateTime.ofInstant(atributos.creationTime().toInstant(), ZoneId.systemDefault());
                            LocalDateTime fechaModificacionLocal = LocalDateTime.ofInstant(atributos.lastModifiedTime().toInstant(), ZoneId.systemDefault());
                            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                               
                            fechaCreacion = fechaCreacionLocal.format(formato);
                            fechaModificacion = fechaModificacionLocal.format(formato);
                                
                            Object[] contenedorArchivo = new Object[]{
                                nombre, ext, rutaDeImage, fechaCreacion, fechaModificacion, espacioImg, aparato, modelo
                            };
                            modeloT.addRow(contenedorArchivo);
                            
                        }catch(IOException e){
                            JOptionPane.showMessageDialog(null, e.toString());
                       }
                    }
                }
            }
        }
}
