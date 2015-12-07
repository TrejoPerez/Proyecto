/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulo;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author root
 */
public class CodigoGraficadora extends Canvas{
    //Medidas 1 cm = 37.795276 px
    public static float ladoA=0;
    public static float ladoB=0;
    public static float ladoC=0;
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        //Dibujamos la recta
        g.setColor(Color.BLACK);
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        g.drawLine(getWidth()/2, getHeight(),getWidth()/2 , 0);
        
        g.setColor(Color.red);
        //Lado C
        //g.drawLine(getWidth()/2,getHeight()/2,  getWidth()/2,getHeight()/4);
        g.drawLine(getWidth()/2,getHeight()/2,  getWidth()/2,(int)ladoA* (int)37.795276);
        //Lado B
        //g.drawLine(getWidth()/2, getHeight()/2, getWidth()*3/4, getHeight()/2);
        g.drawLine(getWidth()/2, getHeight()/2, getWidth()*3/4, (int)ladoB* (int)37.795276);
        //Lado C
        //g.drawLine(getWidth()/2, getHeight()/4, getWidth()*3/4, getHeight()/2);
        g.drawLine(getWidth()/2, getHeight()/4, getWidth()*3/4, (int)ladoC* (int)37.795276);
        System.out.println("La altura es de "+ getHeight());
        System.out.println("El ancho es de "+ getWidth());
        
        
    }
    
}
