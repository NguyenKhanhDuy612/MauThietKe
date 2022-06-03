/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern.Bai1_OBS1;

/**
 *
 * @author Admin
 */
public class LopB implements Topic.topicObserver{
    Topic dvTopic;
    String topic;
    int stt = 0;

    public void setTopic(Topic topic) {
        this.dvTopic = topic;
    }

    public void dangKy() {
        this.dvTopic.dangKy(this);
        this.topic = this.dvTopic.topic;
    }

    public void huyDangKy() {
        this.dvTopic.huyDangKy(this);
    }

    @Override
    public void capNhat(String topicMoi) {
        if (topicMoi != null) {
            stt++;
            System.out.println("Thành viên B đưa tin cũ: " + topic);
            System.out.println("Thành viên B đưa tin mới: " + "STT: " + stt +" "+ topicMoi);
        }
       // this.topic = topicMoi;
        //stt++;
    }
}
