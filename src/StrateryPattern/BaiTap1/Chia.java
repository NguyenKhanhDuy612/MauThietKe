/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrateryPattern.BaiTap1;

/**
 *
 * @author Admin
 */
public class Chia implements ITinh{
        float c;

    @Override
    public float tinh(float a, float b) {
        if(b == 0){
            System.out.println("Mau bang khong !!!");
        }
        else{
            c = a/b;
        }
        return c;
    }
    
}
