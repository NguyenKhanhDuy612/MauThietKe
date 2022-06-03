/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CompositePattern;

/**
 *
 * @author Admin
 */
public class compositeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFile data = new Folder("data", "15/4");
        AbstractFile toan = new Folder("toan", "15/4");
        AbstractFile ly = new Folder("ly", "15/4");
        AbstractFile hoa = new Folder("hoa", "15/4");
        AbstractFile MTK = new Folder("MTK", "15/4");
        
        
        
        //Trong toán có
        AbstractFile giaiTich = new File("GiaiTich", "15/4");
        //Trong toan có
        AbstractFile giaiTichA = new File("GiaiTichA.pdf", "15/4");

        AbstractFile hinhNYC = new File("NYC.jpg", "15/4");
        AbstractFile DiDong = new File("Didong", "15/4");
        
        
        
        data.add(toan);
        data.add(ly);
        data.add(hoa);

//        data.add(giaiTich);
        toan.add(giaiTichA);
        toan.add(giaiTich);
        data.add(hinhNYC);
        data.add(MTK);
        data.add(DiDong);

        System.out.println("Cây thư mục data: ");
        System.out.println(data.getStringTreeFolder());
        System.out.println("Cây thư mục Toán: ");
        System.out.println(toan.getStringTreeFolder());

    }
    
}
