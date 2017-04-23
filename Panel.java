import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Panel extends JPanel{
    private ArrayList<Pelota> pelotas = new ArrayList<>();
    
    public void add(Pelota b){
        pelotas.add(b);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(Pelota b: pelotas){
            g2.fill(b.getShape());
        }
    }
}