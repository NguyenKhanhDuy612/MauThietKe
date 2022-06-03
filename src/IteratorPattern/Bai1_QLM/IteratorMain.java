/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IteratorPattern.Bai1_QLM;

/**
 *
 * @author Admin
 */
public class IteratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyIterator iterator = new MyArray().createInterator();
        
        System.out.println(iterator.first());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println(iterator.next());

        System.out.println(iterator.next());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.isDone());
    }
    
}
