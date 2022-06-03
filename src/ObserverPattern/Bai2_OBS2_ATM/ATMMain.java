/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObserverPattern.Bai2_OBS2_ATM;

/**
 *
 * @author Admin
 */
public class ATMMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM atm = new ATM();
        TaiKhoan minh = new TaiKhoan("Minh", 10000, atm);
        TaiKhoan duy = new TaiKhoan("Duy", 150000, atm);
        
        System.out.println("Giao dich lan 1");
        minh.duaTheVAoATM();
        atm.rutTien(50);
        minh.rutThe();
        System.out.println("Giao dich lan 2");
        duy.duaTheVAoATM();
        atm.rutTien(200);
        duy.rutThe();
        
        System.out.println("Giao dich lan 3");
        atm.rutTien(20);
        duy.rutThe();
        System.out.println("GIao dich lan 4");
        atm.rutTien(10);
    }
    
}
