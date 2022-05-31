/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StrateryPattern.Bai3_SoSanh;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class MainQLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLSV qlsv = new QLSV();
        qlsv.getSv().add(new SinhVien("Nguyen Khanh Duy", new Date(2001,20,8),(float)6.5));
        qlsv.getSv().add(new SinhVien("Nguyen Khanh C", new Date(2001,20,8),(float)8.5));
        qlsv.getSv().add(new SinhVien("Nguyen Khanh A", new Date(2001,20,8),(float)6.5));
        qlsv.getSv().add(new SinhVien("Nguyen Khanh N", new Date(2001,20,8),(float)7.5));
        
        
         System.out.println("SO sanh the tên");
        qlsv.setSoSanh(new  SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();
        
        
        System.out.println("SO sanh the Diem");
        qlsv.setSoSanh(new  SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
    
}
