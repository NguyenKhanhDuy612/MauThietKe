/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IteratorPattern.Bai1_QLM;

/**
 *
 * @author Admin
 */
public class ArrayIterator implements MyIterator{
    int i=0;
    MyArray array;

    public ArrayIterator(MyArray array) {
        {this.array = array;}
    }


    @Override
    public Object next() {
        i++;
        return array.getItem(i);
    }


    @Override
    public Object first() {
        return array.getItem(0);    }

    @Override
    public boolean isDone() {
        if(i >= array.count()-1){
            return true;
        }
            return false;
        
    }

    @Override
    public Object currentItem() {
        return array.getItem(i);
    }
}
