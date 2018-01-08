/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

/**
 *
 * @author Kamil
 */
public class MoveVisitor implements Visitor {

    private final double xMove;
    private final double yMove;

    public MoveVisitor(double xMove, double yMove) {
        this.xMove = xMove;
        this.yMove = (-1) * yMove;
    }

    @Override
    public void visitEllipse(Ellipse e) {
        e.setX((int) (e.getX() + xMove));
        e.setY((int) (e.getY() + yMove));
    }

    @Override
    public void visitRectangle(Rectangle r) {
        r.setX((int) (r.getX() + xMove));
        r.setY((int) (r.getY() + yMove));
    }

    @Override
    public void visitPolygon(Polygon p) {
        int nPoints = p.getnPoints();
        int[] xPoints = p.getxPoints();
        int[] yPoints = p.getyPoints();
        for (int i = 0; i < nPoints; i++) {
            xPoints[i] += xMove;
            yPoints[i] += yMove;

        }
    }

    @Override
    public void visitLine(Line l) {

        l.setX1((int) (l.getX1() + xMove));
        l.setY1((int) (l.getY1() + yMove));
        l.setX2((int) (l.getX2() + xMove));
        l.setY2((int) (l.getY2() + yMove));
    }

    @Override
    public Visitor reverse() {
        return new MoveVisitor((-1) * xMove, yMove);
    }
}
