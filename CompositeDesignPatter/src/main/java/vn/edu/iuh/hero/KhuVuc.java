/*
 * @ (#) KhuVuc.java    1.0    3/11/2025
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

public class KhuVuc implements Item{
    private List<Item> bans;
    private String tenKhuVuc;

    public KhuVuc(String tenKhuVuc) {
        this.tenKhuVuc = tenKhuVuc;
        this.bans = new ArrayList<>();
    }

    public void themBan(Ban ban) {
        bans.add(ban);
    }

    public void xoaBan(Ban ban) {
        bans.remove(ban);
    }


    @Override
    public double getPrice() {
        double tongTien = 0;
        for (Item ban : bans) {
            tongTien += ban.getPrice();
        }
        return tongTien;
    }
}
