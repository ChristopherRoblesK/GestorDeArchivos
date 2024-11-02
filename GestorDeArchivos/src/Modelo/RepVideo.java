
package Modelo;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.FileInputStream;
import java.io.InputStream;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;






public class RepVideo extends Archivos{
    
    private String rutaDeVideo;
   
    public RepVideo(File[] archivo) {
        super(archivo);
    }
    
    public void mostrarArchivoVideo(File directorio, DefaultTableModel modeloT, String[] extensiones){
        File[] archiv = directorio.listFiles();
        if(archiv != null){
            for(File archi : archiv){
                if(archi.isFile()){
                    for(String extension : extensiones){
                        if(archi.getName().endsWith(extension)){
                            rutaDeVideo = archi.getAbsolutePath();
                            
                            try (InputStream input = new FileInputStream(rutaDeVideo)) {
                                AutoDetectParser parser = new AutoDetectParser();
                                BodyContentHandler handler = new BodyContentHandler();
                                Metadata metadata = new Metadata();

                                parser.parse(input, handler, metadata);
                                
                                // Imprimir la duración del archivo
                                String duracion = metadata.get("xmpDM:duration");
                                duracion = duracion != null ? duracion : "N/A";//si no se encuentra la duración imprimir 
                                // Imprimir metadatos específicos utilizando TikaCoreProperties
                                String nombre = archi.getName();
                                String ext = extension;
                                double tamanioByte = archi.length();
                                double tamanioMB = tamanioByte / (1024 * 1024);
                                String espacioVid = String.format("%.2f MB" , tamanioMB);
                                        
                                Object[] contenedorArchivo = new Object[]{
                                    nombre, ext, duracion, rutaDeVideo, espacioVid
                                };
                                modeloT.addRow(contenedorArchivo);
                            } catch (Exception e) {
                               JOptionPane.showMessageDialog(null, e.toString());
                            }
                            break; // no se siguen verificando otras extensiones
                        }
                    }
                }
                else{
                    mostrarArchivoVideo(archi, modeloT, extensiones);
                }
            }
            
        }
    }
    public void mostrarVideosDup(File directorio, DefaultTableModel modeloT, String[] extensiones) {
        HashMap<String, List<File>> mapaArchivo = new HashMap<>();
        procesarArchivosD(directorio, mapaArchivo, extensiones);
        for(Map.Entry<String, List<File>> entrada : mapaArchivo.entrySet()) {
            List<File> listaArchivo = entrada.getValue();
            if(listaArchivo.size() > 1) { // Solo archivos duplicados
                if(listaArchivo.size() > 1) {
                    File archivoDuplicado = listaArchivo.get(0);
                    rutaDeVideo = archivoDuplicado.getAbsolutePath();
                            
                    try (InputStream input = new FileInputStream(rutaDeVideo)) {
                        AutoDetectParser parser = new AutoDetectParser();
                        BodyContentHandler handler = new BodyContentHandler();
                        Metadata metadata = new Metadata();
                        parser.parse(input, handler, metadata);
                                
                        // Imprimir la duración del archivo
                        String duracion = metadata.get("xmpDM:duration");
                        duracion = duracion != null ? duracion : "N/A";//si no se encuentra la duración imprimir 
                        // Imprimir metadatos específicos utilizando TikaCoreProperties
                        String nombre = archivoDuplicado.getName();
                        String ext = getExtension(nombre);
                        double tamanioByte = archivoDuplicado.length();
                        double tamanioMB = tamanioByte / (1024 * 1024);
                        String espacioVid = String.format("%.2f MB" , tamanioMB);
                                        
                        Object[] contenedorArchivo = new Object[]{
                            nombre, ext, duracion, rutaDeVideo, espacioVid
                        };
                        modeloT.addRow(contenedorArchivo);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.toString());
                    }
                }
            }
        }
   }
 
}
