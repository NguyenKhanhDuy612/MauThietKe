/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.Bai2_GioHang;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class GioHang{
    IThanhToan hinhThucTT;
    List<HangHoa> hh = new ArrayList<>();

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public List<HangHoa> getHh() {
        return hh;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void setHh(List<HangHoa> hh) {
        this.hh = hh;
    }
    
    public void inDS(){
        hh.forEach(hangHoa -> {
            System.out.println("Ten hang: "+hangHoa.tenHH+
                    "\nGia: "+hangHoa.gia+
                    "\nMo ta: "+hangHoa.moTa);
        });
    }

    //
    public double thanhToan(){
        double tien = hh.stream().mapToDouble(hangHoa -> hangHoa.gia).sum();
        return hinhThucTT.thanhToan((int) tien);
    }
    
    
    
}
