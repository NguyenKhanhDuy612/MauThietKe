/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.BaiTap1;

/**
 *
 * @author Admin
 */
public class context{
    ITinh tinh ;
    
    void setTinhToan(ITinh a){
        this.tinh = a;
    }

    
    public float tinh(float a, float b) {
        return this.tinh.tinh(a, b);
    }
    
}
