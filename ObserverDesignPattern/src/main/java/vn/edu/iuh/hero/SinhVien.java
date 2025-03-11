/*
 * @ (#) SinhVien.java    1.0    3/11/2025
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

public class SinhVien implements Observer{

    private String hoTen;

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public void update(String message) {
        System.out.println(hoTen + " nhan thong bao: " + message);
    }
}
