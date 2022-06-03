/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai1_GioHang;

/**
 *
 * @author Admin
 */
public class GioHangOnline extends GioHang{
    @Override
    public double tinhChietKhau() {
        if (TinhTien() > 1000)
            return TinhTien()*0.05*0.03;
        else
            return TinhTien()*0.03;
    }
}
