/*
 * @ (#) Quan.java    1.0    3/11/2025
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

public class Quan implements Item{

    private List<Item> khuVucs;
    private String tenQuan;

    public Quan(String tenQuan) {
        this.tenQuan = tenQuan;
        this.khuVucs = new ArrayList<>();
    }

    public void themKhuVuc(KhuVuc khuVuc) {
        khuVucs.add(khuVuc);
    }

    public void xoaKhuVuc(KhuVuc khuVuc) {
        khuVucs.remove(khuVuc);
    }

    @Override
    public double getPrice() {
        double tongTien = 0;
        for (Item khuVuc : khuVucs) {
            tongTien += khuVuc.getPrice();
        }
        return tongTien;
    }
}
