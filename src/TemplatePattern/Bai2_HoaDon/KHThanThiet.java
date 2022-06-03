/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai2_HoaDon;

/**
 *
 * @author Admin
 */
public class KHThanThiet extends HoaDon{
    @Override
    double tinhChiecKhau(double tien) {
        if(tien >= 500000){
            return tien*0.02;
        }
        return tien * 0.0 ;
    }
    
    public static KHThanThiet createGioHang(){
        return new KHThanThiet();
    }
}
