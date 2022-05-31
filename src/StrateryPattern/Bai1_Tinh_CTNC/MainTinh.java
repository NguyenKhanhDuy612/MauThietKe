/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StrateryPattern.Bai1_Tinh_CTNC;

/**
 *
 * @author Admin
 */
public class MainTinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context tcontext = new context();
        ITinh c = new  Cong();
        ITinh t = new  Tru();
        ITinh n = new  Nhan();
        ITinh ch = new  Chia();

        tcontext.setTinhToan(c);
        System.out.println("75 + 12 = "+tcontext.Tinh(75, 12));
        
        tcontext.setTinhToan(t);
        System.out.println("54 - 78 = "+tcontext.Tinh(54, 78));

    }
    
}
