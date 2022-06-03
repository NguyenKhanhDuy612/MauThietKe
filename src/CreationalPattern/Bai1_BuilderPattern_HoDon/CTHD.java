/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalPattern.Bai1_BuilderPattern_HoDon;

/**
 *
 * @author Admin
 */
public class CTHD {
    String sp ;
    int sl;
    int donGia;
    double chietKhau;

    public CTHD(String sp, int sl, int donGia, double chietKhau) {
        this.sp = sp;
        this.sl = sl;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "sp=" + sp + ", sl=" + sl + ", donGia=" + donGia + ", chietKhau=" + chietKhau + '}';
    }
    
    
}
