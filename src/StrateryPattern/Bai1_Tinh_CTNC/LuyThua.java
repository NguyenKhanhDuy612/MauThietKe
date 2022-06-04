/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.Bai1_Tinh_CTNC;

/**
 *
 * @author Admin
 */
public class LuyThua implements ITinh{

    @Override
    public float Tinh(float a, float b) {
        return (float) Math.pow(a, b);
    }
    
}
