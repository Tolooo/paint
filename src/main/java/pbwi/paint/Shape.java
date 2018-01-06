/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public abstract class Shape{
    public final void draw(Graphics g) {
        drawShape(g);
    }
    public abstract void drawShape(Graphics g);
    public Color getColor() {
        return new Color(222);
    }
    public void getStroke() {
    
}
}
