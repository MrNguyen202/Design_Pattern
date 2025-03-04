/*
 * @ (#) DirectorState.java    1.0    3/4/2025
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

public class DirectorState implements PositionState {
    @Override
    public void doWork(String name) {
        System.out.println(name + " (Giám đốc) phải làm:");
        System.out.println("- Ký duyệt");
        System.out.println("- Họp hội đồng");
    }
}
