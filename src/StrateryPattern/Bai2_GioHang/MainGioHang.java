/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StrateryPattern.Bai2_GioHang;

/**
 *
 * @author Admin
 */
public class MainGioHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh = new GioHang();
        gh.getHh().add(new HangHoa("Kem",4000000,"cay"));
        gh.getHh().add(new HangHoa("Kem",4000000,"cay"));

        gh.setHinhThucTT(new ThanhToanOnline());
        gh.inDS();
        System.out.println("Tong tien thanh toan Online: " + gh.thanhToan());
        
        gh.setHinhThucTT(new ThanhToanCOD());
        gh.inDS();
        System.out.println("Tong tien thanh toan COD: " + gh.thanhToan());
    }

    
    
}
