/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePattern.Bai2_HoaDon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public abstract class HoaDon {
    List<MatHang> dsHang = new ArrayList();

    abstract double tinhChiecKhau(double tongtien);
    
    
    
    private double tinhTien(){
        double tien = 0;
        for (MatHang mh : dsHang) {
              tien +=(mh.donGia* mh.soLuong);
        }
        return tien;
    }
    
    double tinhTienChiecKhau(){

        return tinhChiecKhau(tinhTien());
    }
    
    void hienThiGioHang(){
        int i=0;
        System.out.println("Danh sách mặt hàng");
        for (MatHang mh : dsHang) {
              System.out.println("Mặt hàng: " + ++i);
              System.out.println(mh.tenMH  );
              System.out.println(mh.donGia );
              System.out.println(mh.soLuong);
              
        }  
        double tien = tinhTien();
        double tienck = tinhChiecKhau(tien);
        System.out.println("Tiền chưa chiếc khấu: " + tien);
        System.out.println("Tiền chiếc khấu: " + tienck );
        System.out.println("Tiền khách hàng phải trả: " + (tien - tienck));
    }
}
