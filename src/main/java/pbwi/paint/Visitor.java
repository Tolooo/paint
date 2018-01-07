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
interface Visitor {

    public void visitEllipse(Ellipse e);

    public void visitRectangle(Rectangle r);

    public void visitPolygon(Polygon p);

    public void visitLine(Line l);

}
