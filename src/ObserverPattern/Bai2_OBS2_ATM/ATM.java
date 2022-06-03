/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern.Bai2_OBS2_ATM;

/**
 *
 * @author Admin
 */
public class ATM {
    private ITaiKhoanITM taiKhoan;
    
    public void attach(ITaiKhoanITM taiKhoan){
        this.taiKhoan = taiKhoan;
    }
    
    public void detach(){
        this.taiKhoan =null;
    }
    
    private boolean kiemTraTienRut(int soTienRut){
        return taiKhoan.kiemTraSoDu(soTienRut);
    }
    
    public void  rutTien(int soTienRut){
        if(taiKhoan!=null){
            if(kiemTraTienRut(soTienRut)){
                taiKhoan.thongBao(soTienRut, true);
            }
            else{
                taiKhoan.thongBao(soTienRut, false);
            }
        }
        else{
            System.out.println("Khong co the trong may!!!");
        }
    }
    
    public static interface ITaiKhoanITM{
        boolean kiemTraSoDu(int soTienRut); 
        void thongBao(int soTienRut, boolean thanhCong);
        
    }
}
