/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.Bai3_SoSanh;

/**
 *
 * @author Admin
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.diemTB > o2.diemTB){
            return 1;
        }
        else{
            if(o1.diemTB == o2.diemTB){
                return 0;
            }
            else{
                return -1;
            }
        }
    }
     
}
