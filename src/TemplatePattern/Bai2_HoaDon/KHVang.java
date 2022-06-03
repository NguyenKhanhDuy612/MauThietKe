/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai2_HoaDon;

/**
 *
 * @author Admin
 */
public class KHVang extends HoaDon {

    @Override
    double tinhChiecKhau(double tien) {
        if (tien >= 1000000) {
            return (tien * 0.05);
        } else if (tien >= 500000) {
            return tien * 0.03;
        }
        return tien * 0.0;
    }

    public static KHVang createGioHang() {
        return new KHVang();
    }
}
