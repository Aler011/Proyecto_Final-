
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvin
 */
public class Arista {
    
    int x1, x2, x3, x4, pes;
    int ni, nf;
     Color c1 = Color.red;
    Color c2 = Color.BLACK;
    

    public Arista(int x1, int x2, int x3, int x4, int pes, int ni, int nf) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.pes = pes;
        this.ni = ni;
        this.nf = nf;
    }

    
    public void linea(Graphics g, int e){
        
        if(e == 1){
          g.setColor(c1);
        }else if(e == 2){
            g.setColor(c2);
        }
        g.drawLine(getX1(), getX2(), getX3(), getX4());
        g.setColor(Color.black);
        g.drawString(Integer.toString(getPes()), (getX1() + getX3())/2, (getX2() + getX4())/2);
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    
    public int getNi() {
        return ni;
    }

    public int getNf() {
        return nf;
    }
    
    
    
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }
    
    
    
}
