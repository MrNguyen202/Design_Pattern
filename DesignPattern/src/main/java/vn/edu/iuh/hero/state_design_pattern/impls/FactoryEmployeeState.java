/*
 * @ (#) FactoryEmployeeState.java    1.0    3/4/2025
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

public class FactoryEmployeeState implements PositionState {
    @Override
    public void doWork(String name) {
        System.out.println(name + " (Nhân Viên Xưởng) phải làm:");
        System.out.println("- Sản xuất");
        System.out.println("- Vận hành máy");
    }
}
