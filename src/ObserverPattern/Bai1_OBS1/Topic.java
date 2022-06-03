/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern.Bai1_OBS1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Topic {
    List<topicObserver> listteners = new ArrayList<>();
    String topic;

    //quan hệ một - nhiều
    public Topic(String topic) {
        this.topic = topic;
    }
    public void dangKy(topicObserver observer) {
        if (!listteners.contains(observer)) {
            listteners.add(observer);
        }
    }

    public void huyDangKy(topicObserver observer) {
        if (listteners.contains(observer)) {
            listteners.remove(observer);
        }
    }

    public void capNhatTopic(String topicMoi){
        this.topic=topicMoi;
        for(topicObserver o : listteners)
            o.capNhat(topicMoi);
    }
    
    public static interface topicObserver {

        void capNhat(String topicMoi);
    }
}
