/*
 * @ (#) SanPham.java    1.0    3/11/2025
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

public class SanPham implements Item{

    private String tenSanPham;
    private double giaSanPham;

    public SanPham(String tenSanPham, double giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }

    @Override
    public double getPrice() {
        return giaSanPham;
    }
}
