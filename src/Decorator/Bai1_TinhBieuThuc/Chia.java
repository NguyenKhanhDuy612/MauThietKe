/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.Bai1_TinhBieuThuc;

/**
 *
 * @author Admin
 */
public class Chia extends BieuThucDecorator{
    float toanHang;

    public Chia(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

   

    @Override
    public float giaTri() {
        return bieuThuc.giaTri()/toanHang;
    }

    @Override
    public String bieuThuc() {
        return  bieuThuc.bieuThuc() + "/" + toanHang ;
    }
    
    
}
