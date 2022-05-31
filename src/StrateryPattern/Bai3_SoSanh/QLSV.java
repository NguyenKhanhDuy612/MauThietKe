/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.Bai3_SoSanh;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLSV {
    List<SinhVien> sv = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void setSv(List<SinhVien> sv) {
        this.sv = sv;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    
    public List<SinhVien> getSv() {
        return sv;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    
    
    public void sapXep(){
        sv.sort((o1,o2) ->{
            return soSanh.soSanh(o1,o2);
        });
    }
    
    public void inDS(){
        sv.forEach((t)->{
            System.out.println(t.toString());
        });
    }
}
