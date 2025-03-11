/*
 * @ (#) Khoa.java    1.0    3/11/2025
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

public class Khoa {
    private List<LopHoc> lopHocs;

    public Khoa() {
        this.lopHocs = new ArrayList<>();
    }

    public void addLopHoc(LopHoc lopHoc){
        lopHocs.add(lopHoc);
    }
}
