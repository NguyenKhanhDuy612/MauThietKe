/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalPattern.Bai1_BuilderPattern_HoDon;


/**
 *
 * @author Admin
 */
public class HoaDonHeader {
    String mhd, tenKH,ngayBan;

    public HoaDonHeader(String mhd, String tenKH, String ngayBan) {
        this.mhd = mhd;
        this.tenKH = tenKH;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "mhd=" + mhd + ", tenKH=" + tenKH + ", ngayBan=" + ngayBan + '}';
    }
    
    
}
