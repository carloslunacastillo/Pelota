import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame extends JFrame{
    private final JPanel botones;
    private final JButton play;
    private final JButton salir;
    private final Panel panel;
    private Thread hilo;
    private Runnable run;
    private Pelota pelota;
    
    public Frame(){
        super("Pelota rebotando");
        panel = new Panel();
        botones = new JPanel();
        botones.setLayout(new GridLayout(1,3,5,5));
        play = new JButton("PLAY");
        play.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pelota = new Pelota();
                panel.add(pelota);
                run = new Hilo(pelota, panel);
                hilo = new Thread(run);
                hilo.start();
            }
        });
        salir = new JButton("SALIR");
        salir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        botones.add(play);
        botones.add(salir);
        add(panel, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
    }
}
