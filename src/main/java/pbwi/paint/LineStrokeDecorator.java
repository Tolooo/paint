/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.io.Serializable;

public class LineStrokeDecorator extends Decorator implements Serializable{
    private Stroke newStroke;
    
    public LineStrokeDecorator(Shape shape, Stroke stroke) {
        super(shape);
        newStroke = stroke;
    }

    public LineStrokeDecorator(Shape shape) {
        super(shape);
    }
    public void drawShape(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(newStroke);
        shape.draw(g2);
    }
    
    
}
