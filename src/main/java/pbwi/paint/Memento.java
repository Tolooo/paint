/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author komputer-prywatny
 */
public class Memento implements Serializable{
    private State state;
    
    public Memento(List<Shape> shapeList, List<Command> undoHistory, List<Command> redoHistory){
        super();
        this.state = new State(shapeList, undoHistory, redoHistory);
         
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    
    
}
