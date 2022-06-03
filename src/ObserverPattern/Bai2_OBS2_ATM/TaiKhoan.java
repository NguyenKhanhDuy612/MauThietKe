/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern.Bai2_OBS2_ATM;

/**
 *
 * @author Admin
 */
public class TaiKhoan implements ATM.ITaiKhoanITM{
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void  duaTheVAoATM(){
        atm.attach(this);
    }
    
    public void rutThe(){
        atm.detach();
    }
    
    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if((soDu - soTienRut )>= 50)
            return true;
        else
            return false;
    }

    @Override
    public void thongBao(int soTienRut, boolean thanhCong) {
        
        System.out.println("Tai khoan: " + ten);
        if(thanhCong){
            System.out.println("So du ban dau: " + soDu);
            soDu = soDu - soTienRut;
            System.out.println("So tien rut: " + soTienRut);
            System.out.println("So du sau khi rut: " + soDu);
        }
        else{
            System.out.println("Rut tien khong thanh cong");
            System.out.println("So du tai khoan: " + soDu);
        }
    }
}
