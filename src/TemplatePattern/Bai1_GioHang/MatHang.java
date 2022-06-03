/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai1_GioHang;

/**
 *
 * @author Admin
 */
public class MatHang {
    String tenMH;
    int soLuong;
    double donGia;

    public MatHang(String tenMH, int soLuong, double donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
