/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public abstract class Shape {

    public final void draw(Graphics g) {
        g.setColor(getColor());
        ((Graphics2D) g).setStroke(getStroke());
        drawShape(g);
    }

    public abstract void drawShape(Graphics g);

    public Color getColor() {
        return Color.BLACK;
    }

    public Stroke getStroke() {
        return new BasicStroke((float) 10.5); //zmienic na BasicStroke();
    }

    public abstract void accept(Visitor v);
}
