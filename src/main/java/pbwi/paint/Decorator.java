/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.io.Serializable;

public abstract class Decorator extends Shape implements Serializable{

    protected Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void accept(Visitor v) {
        shape.accept(v);
    }
;

}
