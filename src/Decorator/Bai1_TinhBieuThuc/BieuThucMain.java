/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Decorator.Bai1_TinhBieuThuc;

/**
 *
 * @author Admin
 */
public class BieuThucMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BieuThuc bieuThuc = new BieuThucDonGian(3);
        bieuThuc = new Chia(3, bieuThuc);
        bieuThuc = new Chia(1, bieuThuc);
        System.err.println(bieuThuc.bieuThuc());
        System.out.println(bieuThuc.giaTri());
    }
    
}
