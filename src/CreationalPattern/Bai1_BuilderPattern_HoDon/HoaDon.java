/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalPattern.Bai1_BuilderPattern_HoDon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDon {

    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds;

    public HoaDon(Builder builder) {
        hoaDonHeader = builder.hoaDonHeader;
        cthds = builder.cthds;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "hoaDonHeader=" + hoaDonHeader + ", cthds=" + cthds + '}';
    }
    
    

    public static class Builder {

        HoaDonHeader hoaDonHeader;
        List<CTHD> cthds = new ArrayList<>();

        public Builder addHoaDonHeader(String mhd, String tenKH, String ngayBan) {
            hoaDonHeader = new HoaDonHeader(mhd, tenKH, ngayBan);
            return this;
        }

        public Builder addCTHD(String sp, int sl, int donGia, double chietKhau) {
            cthds.add(new CTHD(sp, sl, donGia, chietKhau));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }

    }

}
