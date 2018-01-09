/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author komputer-prywatny
 */
public class State implements Serializable{
    private List<Shape> shapeList;
    private List<Command> udnoHistoryList;
    private List<Command> redoHistoryList;

    public State(List<Shape> shapeList, List<Command> udnoHistoryList, List<Command> redoHistoryList) {
        this.shapeList = shapeList;
        this.udnoHistoryList = udnoHistoryList;
        this.redoHistoryList = redoHistoryList;
    }

     
    
    public List<Shape> getShapeList() {
        return shapeList;
    }

    public List<Command> getUdnoHistoryList() {
        return udnoHistoryList;
    }

    public List<Command> getRedoHistoryList() {
        return redoHistoryList;
    }
    
    public ReadStateIterator createReadIterator(){
        
        return new ReadStateIterator();
    }
    
    public SaveStateIterator createSaveIterator(ObjectOutputStream o){
        
        return new SaveStateIterator(o);
    }
    
}
