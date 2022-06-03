/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TemplatePattern.Bai1_GioHang;

/**
 *
 * @author Admin
 */
public class GioHangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh = new GioHangOnline();
        gh.gioHang.add(new MatHang("Socola", 10, 5000));
        gh.gioHang.add(new MatHang("Socola-TTT", 20, 5000));
        gh.gioHang.add(new MatHang("Socola-421", 30, 6000));
        
        gh.hienThiGioHang();
    }
    
}
