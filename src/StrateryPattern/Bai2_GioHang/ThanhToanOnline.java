/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.Bai2_GioHang;

/**
 *
 * @author Admin
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000){
            return tienHang - tienHang*0.05;
        }
        else{
            return tienHang - tienHang*0.07;
        }
    }
    
}
