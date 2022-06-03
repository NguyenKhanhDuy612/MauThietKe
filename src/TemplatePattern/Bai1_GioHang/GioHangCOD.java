/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai1_GioHang;

/**
 *
 * @author Admin
 */
public class GioHangCOD extends GioHang{
    @Override
    public double tinhChietKhau() {
        if(TinhTien() > 1000){
            return TinhTien()*0.05;
        }
        else
            return 0;
    }
}
