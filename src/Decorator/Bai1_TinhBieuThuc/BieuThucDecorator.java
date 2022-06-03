/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.Bai1_TinhBieuThuc;

/**
 *
 * @author Admin
 */
public abstract class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public abstract float giaTri() ;

    @Override
    public abstract String bieuThuc() ;

    
    
    
}
