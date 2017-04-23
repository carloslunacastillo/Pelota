import java.awt.*;
public class Hilo implements Runnable{
    private final Pelota pelota;
    private final Component componente;
    
    public Hilo(Pelota p, Component c){
        pelota = p;
        componente = c;
    }
    
    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            pelota.movimiento(componente.getBounds());
            componente.paint(componente.getGraphics());
            try {
                Thread.sleep(4);
            } 
            catch (InterruptedException ex) {}
        }
    }
}