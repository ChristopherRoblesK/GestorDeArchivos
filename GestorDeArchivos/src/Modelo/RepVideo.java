
package Modelo;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.FileInputStream;
import java.io.InputStream;

import java.io.File;
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
                            String ruta = archi.getAbsolutePath();
                            
                            try (InputStream input = new FileInputStream(ruta)) {
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
                                String rutaArch = archi.getAbsolutePath();
                                double tamanioByte = archi.length();
                                double tamanioMB = tamanioByte / (1024 * 1024);
                                        
                                Object[] contenedorArchivo = new Object[]{
                                    nombre, ext, duracion, rutaArch, tamanioMB
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
    
    
    
    
}
