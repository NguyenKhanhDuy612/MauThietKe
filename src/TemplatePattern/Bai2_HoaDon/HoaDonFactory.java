/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai2_HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonFactory {
    HoaDon hd;
    
    HoaDon createGioHang(KhachHang kHangType){
        HoaDon hoaDon;
        switch (kHangType) {
            case thanThiet -> {
                return hoaDon = KHThanThiet.createGioHang();}
            case vang -> {
                return hoaDon = KHVang.createGioHang();}
            case kimCuong -> {
                return hoaDon = KHKimCuong.createGioHang();}

        }
        return null;

    }
}
