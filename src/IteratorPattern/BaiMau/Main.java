/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IteratorPattern.BaiMau;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeRepository employeeRepository = new EmployeeRepository();
 
        System.out.println("Các nhân viên bao gồm:");
        for(Iterator iterator = employeeRepository.getIterator();
            iterator.hasNext();) {
            String employee = (String)iterator.next();
            System.out.println("Nhân viên: " + employee);
        }
 
        System.out.println("------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
    
}
