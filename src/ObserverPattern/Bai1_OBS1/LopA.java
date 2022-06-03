/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern.Bai1_OBS1;

/**
 *
 * @author Admin
 */
public class LopA implements Topic.topicObserver{
    Topic dvTopic;
    String topic;

    public void setTopic(Topic topic) {
        this.dvTopic = topic;
    }
    

    public void dangKy() {//đk observer cho tỉ giá
        this.dvTopic.dangKy(this);
        this.topic = this.dvTopic.topic;//khi nào đk thì lấy luôn gt ban đầu
    }

    public void huyDangKy() {
        this.dvTopic.huyDangKy(this);
    }

    @Override
    public void capNhat(String topicMoi) {
        if (topicMoi != null) {
            topicMoi = dvTopic.topic;
        }
        System.out.println("Thành viên A:  " + topicMoi);
        this.topic = topicMoi;
    }
}
