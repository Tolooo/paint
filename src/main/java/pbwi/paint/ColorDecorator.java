/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.io.Serializable;

public class ColorDecorator extends Decorator implements Serializable{
    private Color newColor;

    public ColorDecorator(Shape shape, Color color) {
        super(shape);
        newColor = color;
    }
    
    public void drawShape(Graphics g) {
        g.setColor(newColor);
        shape.draw(g);
    }
    
    public Color getColor() {
        return newColor;
    }
}
