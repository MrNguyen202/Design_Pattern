/*
 * @ (#) ChiefAccountantState.java    1.0    3/4/2025
 *
 *
 */

package vn.edu.iuh.hero.state_design_pattern.impls;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/4/2025
 * @Version: 1.0
 *
 */

import vn.edu.iuh.hero.state_design_pattern.PositionState;

public class ChiefAccountantState implements PositionState {
    @Override
    public void doWork(String name) {
        System.out.println(name + " (Kế Toán Trưởng) phải làm:");
        System.out.println("- Lập báo cáo tài chính");
        System.out.println("- Kiểm tra sổ sách");
    }
}
