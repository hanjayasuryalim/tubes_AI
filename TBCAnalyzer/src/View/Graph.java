/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import java.awt.*;
import static View.FuzzyLogic.*;
import View.*;
import Controller.*;

/**
 *
 * @author User
 */
public class Graph extends JPanel{
    double a;
    double b;
    double c;
    double d;
    double e;
    String judul;
    String type;
    double degree;
    double value;
    double distance;
    
    public Graph(double a, double b, double c, double d, double e, String judul, String type, double degree, double value, double distance) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.judul = judul;
        this.degree = degree;
        this.type = type;
        this.value = value;
        this.distance = distance;
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(Color.WHITE);
        this.setSize(400, 400);
        
        System.out.println("degree:" + degree);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.BLACK);
        //judul
        g.drawString(judul, 50, 50);
        
        g.drawLine(100, 300, 600, 300);
        g.drawLine(100, 300, 100, 100);
        g.drawString(String.valueOf(a), 150, 320);
        g.drawString(String.valueOf(b), 250, 320);
        g.drawString(String.valueOf(c), 350, 320);
        g.drawString(String.valueOf(d), 450, 320);
        g.drawString(String.valueOf(e), 550, 320);
        
        //graph
        
        if (type.equals("Rendah")) {
            drawRendah(g);
        } else if(type.equals("Normal")){
            drawNormal(g);
        } else if (type.equals("Tinggi")){
            drawTinggi(g);
        }
        
        //get methods
        
        //point
        drawPoint(g);
    }
    
    protected void drawPoint(Graphics g){
        Graphics2D g2d = (Graphics2D) g.create();


        Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        g2d.setStroke(dashed);
        g2d.setColor(Color.BLACK);
        
        g2d.drawLine(100, (int)(150 + ((1.0-degree)*150)) , 120 + (int)((distance)*450), (int)(150 + ((1.0-degree)*150)));
        
        g.drawString(String.valueOf(value), 120 + (int)((distance)*450), 320);
        
        g2d.drawString("Nilai alpha predikat: " + String.valueOf(degree), 250, 400);
    }
    
    protected void drawRendah(Graphics g){
        g.setColor(Color.BLUE);
        g.drawLine(150, 150, 250, 150);
        g.drawLine(250, 150, 350, 300);
    }
    
    protected void drawNormal(Graphics g){
        g.setColor(Color.GREEN);
        g.drawLine(250, 300, 350, 150);
        g.drawLine(350, 150, 450, 300);
    }
    
    protected void drawTinggi(Graphics g){
        g.setColor(Color.RED);
        
        g.drawLine(350, 300, 450, 150);
        g.drawLine(450, 150, 550, 150);
    }
    
}
