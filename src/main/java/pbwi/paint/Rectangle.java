/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {
    private int height;
    private int width;
    private int x;
    private int y;

    public Rectangle(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }


    @Override
    public void drawShape(Graphics g) {
        g.fillRect(x, y, width, height);
    }
    
    
}
