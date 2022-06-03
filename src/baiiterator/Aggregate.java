/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiiterator;

/**
 *
 * @author minht
 * @param <T>
 */
public abstract class Aggregate<T> {
   abstract  Iterator<T> createIterator();
   
    
    
}
