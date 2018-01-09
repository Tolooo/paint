/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

public class ScaleVisitor implements Visitor  {

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
        int nPoints = p.getnPoints();
        int[] xPoints = p.getxPoints();
        int[] yPoints = p.getyPoints();

        int minx = xPoints[nPoints - 1];
        int maxx = (xPoints[1]);
        maxx = minx + (int) ((maxx - minx) * xScale);

        int miny = yPoints[0];
        int maxy = (yPoints[2]);
        maxy = miny + (int) ((maxy - miny) * yScale);

        int xpoints[] = {minx + (maxx - minx) / 2, maxx, maxx - (maxx - minx) / 5, minx + (maxx - minx) / 5, minx};
        int ypoints[] = {miny, miny + (maxy - miny) / 3, maxy, maxy, miny + (maxy - miny) / 3};

        p.setxPoints(xpoints);
        p.setyPoints(ypoints);
    }

    @Override
    public void visitLine(Line l) {
        double xR = (l.getX1() - l.getX2()) * xScale;
        double yR = (l.getY1() - l.getY2()) * yScale;
        l.setX2(l.getX1() - (int) xR);
        l.setY2(l.getY1() - (int) yR);
    }

    @Override
    public Visitor reverse() {
        return new ScaleVisitor(1 / xScale, 1 / yScale);
    }

}
