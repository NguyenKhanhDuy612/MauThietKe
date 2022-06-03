/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai1_GioHang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class GioHang {

    List<MatHang> gioHang = new ArrayList<>();

    public double TinhTien() {
        double tienHang = 0;
        for (int i = 0; i < gioHang.size(); i++) {
            tienHang = tienHang + gioHang.get(i).donGia * gioHang.get(i).soLuong;
        }
        return tienHang;
    }

    public abstract double tinhChietKhau();

    public void hienThiGioHang() {
        for (int i = 0; i < gioHang.size(); i++) {
            System.out.println("TenMH=" + gioHang.get(i).tenMH + "\tSoLuong=" + gioHang.get(i).soLuong + "\tdonGia=" + gioHang.get(i)
                    + "\tThanhTien=" + gioHang.get(i).soLuong * gioHang.get(i).donGia);
        }

        System.out.println("Tổng tiền thanh toán là" + TinhTien());
        System.out.println("So tien chiet khau la" + tinhChietKhau());
        System.out.println("Tong so tien thanh toan sau khi tru chiet khau=" + (TinhTien() - tinhChietKhau()));
    }
}
