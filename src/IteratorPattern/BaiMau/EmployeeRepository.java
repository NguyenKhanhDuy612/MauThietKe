/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IteratorPattern.BaiMau;

/**
 *
 * @author Admin
 */
public class EmployeeRepository implements Sector{
    public String[] employees = {"Quyền", "Tiến", "Sơn", "Hòa", "Thành"};
 
    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }
 
    private class EmployeeIterator implements Iterator {
        int index;
 
        @Override
        public boolean hasNext() {
            if(index < employees.length) {
                return true;
            }
            return false;
        }
 
        @Override
        public Object next() {
            if(this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}
