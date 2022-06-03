/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IteratorPattern.Bai1_QLM;

/**
 *
 * @author Admin
 */
public interface MyIterator {
    Object first();
    Object next();
    boolean isDone();
    Object currentItem();
}
