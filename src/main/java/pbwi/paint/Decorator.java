/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

public abstract class Decorator extends Shape{
    protected Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }
    
    public void accept(Visitor v){};
}
