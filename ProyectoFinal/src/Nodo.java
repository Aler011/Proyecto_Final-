
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvin
 */
public class Nodo {
    int x = 0;
    int y = 0;
    int d = 25;
    
    Color c1 = Color.red;
    Color c2 = Color.black;
    Color c3 = Color.black;

    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
  
    }

    
    public void dibujar(Graphics g, int nombre, int e){
        if(e == 1){
          g.setColor(c1);
        }else if(e == 2){
            g.setColor(c2);
        }else{
            g.setColor(c3);
        }
       
        g.fillOval(getX() - (d/2), getY() - (d/2), d, d);
        g.setColor(c3);
        g.drawOval(getX() - (d/2), getY() - (d/2), d, d);
        g.setColor(Color.WHITE);
        g.drawString(Integer.toString(nombre), getX(), getY());
        
    }
   

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    
    
    
    
}
