/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Alan E. Ibarra López
 */
public class Lienzo extends Canvas{
    
    int ancho,alto;
    public Lienzo(int w,int h){
        //obtenemos las dimensiones de la interfaz grafica
        this.ancho = w;
        this.alto = h;
        //se las asignamos al canvas
        this.setSize(ancho, alto);
        //this.setBackground(Color.red);
        //lo pintamos de algun color el cual sera el fondo de nuestra aplicacion
        this.setBackground(Color.orange);
        
    }
    
    @Override
    public void paint(Graphics g){
        //Graphics2D gra = (Graphics2D)g;
//       g.setColor(Color.red);
//       g.fillRect(0, 0, ancho, alto);
    }
    
}
