/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

public class ScaleVisitor implements Visitor {

    private final double xScale;
    private final double yScale;

    public ScaleVisitor(double xScale, double yScale) {
        this.xScale = xScale;
        this.yScale = yScale;
    }

    @Override
    public void visitEllipse(Ellipse e) {
        e.setHeight((int) (e.getHeight() * yScale));
        e.setWidth((int) (e.getWidth() * xScale));
    }

    @Override
    public void visitRectangle(Rectangle r) {
        r.setHeight((int) (r.getHeight() * yScale));
        r.setWidth((int) (r.getWidth() * xScale));
    }

    @Override
    public void visitPolygon(Polygon p) {

        //????
    }

    @Override
    public void visitLine(Line l) {
        double xR = (l.getX1() - l.getX2()) * xScale;
        double yR = (l.getY1() - l.getY2()) * yScale;
        l.setX2(l.getX1() - (int) xR);
        l.setY2(l.getY1() - (int) yR);
    }

}
