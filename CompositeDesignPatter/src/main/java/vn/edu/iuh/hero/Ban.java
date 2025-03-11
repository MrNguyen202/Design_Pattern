/*
 * @ (#) Ban.java    1.0    3/11/2025
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

public class Ban implements Item {
    private List<Item> sanPhams;
    private int indexBan;

    public Ban(int indexBan) {
        this.indexBan = indexBan;
        this.sanPhams = new ArrayList<>();
    }

    public void themSanPham(Item sanPham) {
        sanPhams.add(sanPham);
    }

    public void xoaSanPham(Item sanPham) {
        sanPhams.remove(sanPham);
    }

    @Override
    public double getPrice() {
        double tongTien = 0;
        for (Item sanPham : sanPhams) {
            tongTien += sanPham.getPrice();
        }
        return tongTien;
    }
}
