/*
 * @ (#) LopHoc.java    1.0    3/11/2025
 *
 *
 */

package vn.edu.iuh.hero;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/11/2025
 * @Version: 1.0
 *
 */

import java.util.ArrayList;
import java.util.List;

public class LopHoc implements Subject{

    private String tenLop;
    private List<Observer> sinhViens;
    private String notification;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.sinhViens = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        sinhViens.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        sinhViens.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : sinhViens) {
            observer.update(message);
        }
    }

    public void setNotification(String notification){
        this.notification = notification;
        notifyObservers(notification);
    }
}
