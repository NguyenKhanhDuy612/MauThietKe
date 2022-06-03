/*
z * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiiterator;

/**
 *
 * @author minht
 * @param <T>
 */
public interface  Iterator <T>{

    abstract boolean hasNext();
    
    abstract T Next();
    abstract T First();
     abstract boolean isDone();
//      abstract T CurrentItem();
     
}
