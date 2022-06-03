/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CreationalPattern.Bai1_BuilderPattern_HoDon;

/**
 *
 * @author Admin
 */
public class MainHoaDon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoaDon = new  HoaDon.Builder()
                .addCTHD("ban", 10, 100, 0.01)
                .addHoaDonHeader("61133540d", "2/4/2022", "Duy")
                .build();
        
        HoaDon hoaDon1 = new  HoaDon.Builder()
                .addCTHD("ban", 10, 100, 0.01)
                .addHoaDonHeader("61133540d", "2/4/2022", "Duy")
                .build();
        
        System.out.println(hoaDon.toString());
        System.out.println(hoaDon1.toString());
    }
    
}
