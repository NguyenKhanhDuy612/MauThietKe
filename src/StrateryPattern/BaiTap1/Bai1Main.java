/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StrateryPattern.BaiTap1;

/**
 *
 * @author Admin
 */
public class Bai1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context cx = new context();
        
        ITinh c = new Cong();
        ITinh t = new Tru();
        ITinh n = new Nhan();
        ITinh ct = new Chia();
        
        cx.setTinhToan(c);
        System.out.println("Ket qua cua 75 + 12 là: " + cx.tinh(75, 12));
        
        
        cx.setTinhToan(t);
        System.out.println("Ket qua cua 75 - 12 là: " + cx.tinh(75, 12));
        
        
        cx.setTinhToan(n);
        System.out.println("Ket qua cua 5 * 2 là: " + cx.tinh(5, 2));
        
        
        cx.setTinhToan(ct);
        System.out.println("Ket qua cua 75 / 5 là: " + cx.tinh(75, 5));
        
        
        cx.setTinhToan(ct);
        System.out.println("Ket qua cua 75 / 0 là: " + cx.tinh(75, 0));
        
    }
    
}
