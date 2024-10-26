
package Modelo;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class RepMusica {
    
     private String rutaDeAudio;
    private Player audio;
    private Thread ejecutarHilo;
    private volatile boolean reproduciendo = false;
    private volatile boolean enPausa = false;
    private final Object pauseLock = new Object();


  
    
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
    
    public synchronized void reproducirAudio(){
       pararAudio(); // Asegúrate de detener cualquier audio en reproducción

        ejecutarHilo = new Thread(() -> {
            try {
                InputStream archivoAudio = new FileInputStream(rutaDeAudio);
                audio = new Player(archivoAudio);

                reproduciendo = true;

                while (reproduciendo) {
                    if (!enPausa && !audio.play(1)) {
                        break;
                    }
                    synchronized (pauseLock) {
                        while (enPausa) {
                            pauseLock.wait();
                        }
                    }
                }

                audio.close();
            } catch (FileNotFoundException | JavaLayerException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        });
        ejecutarHilo.start();
    }
    
    // Método para parar el audio completamente
    public synchronized void pararAudio() {
         reproduciendo = false;

        if (audio != null) {
            audio.close();
            audio = null;
        }

        if (ejecutarHilo != null) {
            ejecutarHilo.interrupt();
            try {
                ejecutarHilo.join();
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            ejecutarHilo = null;
        }
    }
    
    public synchronized void pausarAudio() {
        enPausa = true;
    }

    public synchronized void reanudarAudio() {
        synchronized (pauseLock) {
            enPausa = false;
            pauseLock.notifyAll();
        }
    }
}
