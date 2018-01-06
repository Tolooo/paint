/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.Graphics;


public class Polygon extends Shape {
    private int nPoints;
    private int[] xPoints;
    private int[] yPoints;

    public Polygon(int nPoints, int[] xPoints, int[] yPoints) {
        this.nPoints = nPoints;
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
    
    
    @Override
    public void drawShape(Graphics g) {
       g.drawPolygon(xPoints, yPoints, nPoints);
    }
    
}
