/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplatePattern.Bai2_HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonFactory hD = new HoaDonFactory();

        HoaDon hd1 = hD.createGioHang(KhachHang.thanThiet);
        hd1.dsHang.add(new MatHang("Dép", 300000, 2));
        hd1.dsHang.add(new MatHang("Giày", 700000, 1));

        hd1.hienThiGioHang();

        System.out.println(hd1.tinhTienChiecKhau());
    }

}
