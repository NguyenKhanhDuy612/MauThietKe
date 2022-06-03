/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IteratorPattern.Bai1_QLM;

/**
 *
 * @author Admin
 */
public class MyArray {
    private int[] a = {1,2,3,4,5};

    public int count(){
        return a.length;
    }
    
    public int getItem(int i){
        return a[i];
    }
    
    public MyIterator createInterator() {
        return new ArrayIterator(this);
    }
}
