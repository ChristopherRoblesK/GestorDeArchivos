
package Modelo;

import javafx.application.Platform;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class RepMusica {
    
    private String rutaDeAudio;
    MediaPlayer reproductorDeAudio;
    
    public RepMusica(String rutaDeAudio){
        this.rutaDeAudio = rutaDeAudio;
    }
    
    //Métodos getters
    public String getRutaDeAudio(){
        return rutaDeAudio;
    }
    
    //Métodos setters
    public void setRutaDeAudio(String rutaDeAudio){
        this.rutaDeAudio = rutaDeAudio;
    }
    
    public void reproducirAudio(String rutaDeAudio){
        Platform.runLater(() -> {
            if (reproductorDeAudio != null) {
                reproductorDeAudio.stop();
            }

            File audio = new File(rutaDeAudio);
            System.out.println("Ruta absoluta del archivo: " + audio.getAbsolutePath()); // Imprime la ruta absoluta

            if (!audio.exists()) {
                System.out.println("El archivo de audio no existe: " + rutaDeAudio);
                return;
            }

            try {
                Media archivoDeAudio = new Media(audio.toURI().toString());
                reproductorDeAudio = new MediaPlayer(archivoDeAudio);

                reproductorDeAudio.setOnError(() -> {
                    System.out.println("Error al reproducir el audio: " + reproductorDeAudio.getError().toString());
                });

                reproductorDeAudio.setOnReady(() -> {
                    System.out.println("Reproducción lista, iniciando reproducción.");
                    reproductorDeAudio.play();
                });

            } catch (Exception e) {
                System.out.println("Error al inicializar el media: " + e.toString());
            }
        });
    }
    
    public void pararAudio(){ 
     Platform.runLater(() -> {
            if (reproductorDeAudio != null) {
                reproductorDeAudio.stop();
                reproductorDeAudio.dispose(); // Libera recursos
                reproductorDeAudio = null;
            }
        });
    }
    
}
