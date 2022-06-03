/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObserverPattern.Bai1_OBS1;

/**
 *
 * @author Admin
 */
public class OBSMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Topic topic = new Topic("a");
        Topic topic2 = new Topic("b");
        
        LopA thanhVienA = new LopA();
        LopB thanhVienB = new LopB();
        thanhVienA.setTopic(topic);
        thanhVienB.setTopic(topic);
        
        thanhVienA.dangKy();
        thanhVienB.dangKy();
        
        topic.capNhatTopic("tin mới 1");
      //  System.out.println("");
//        topic.capNhatTopic("tin mới 2");
//        topic.capNhatTopic("tin mới 3");
//        topic.capNhatTopic("tin mới 4");
        thanhVienB.setTopic(topic2);
        thanhVienA.setTopic(topic2);
        topic.capNhatTopic("tin mới 5");
//        topic.capNhatTopic("tin mới 6");
//        topic.capNhatTopic("tin mới 7");
//        topic.capNhatTopic("tin mới 8");
    }
    
}
