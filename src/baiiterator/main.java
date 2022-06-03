/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiiterator;

/**
 *
 * @author minht
 */
public class main {
    public static void main(String[] args) {
         ConcreteAggregate ca = new ConcreteAggregate();
            String[] cars = {"Volvo", "BMW", "Vord", "Madzla"};
            ca.setMenuItems(cars);
            Iterator iterator = ca.createIterator();
            System.out.println(iterator.First());
            while(!iterator.isDone())
            {
                System.out.println(iterator.Next());
            }
            
         
          //  System.out.println(iterator.CurrentItem());
    }
    
    
    
}
