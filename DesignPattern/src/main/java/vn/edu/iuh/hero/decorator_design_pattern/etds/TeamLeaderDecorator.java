/*
 * @ (#) TeamLeaderDecorator.java    1.0    3/4/2025
 *
 *
 */

package vn.edu.iuh.hero.decorator_design_pattern.etds;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/4/2025
 * @Version: 1.0
 *
 */

import vn.edu.iuh.hero.decorator_design_pattern.EmployeeDecorator;
import vn.edu.iuh.hero.decorator_design_pattern.impls.PositionDecorator;

public class TeamLeaderDecorator extends PositionDecorator {

    public TeamLeaderDecorator(EmployeeDecorator employeeDecorator) {
        super(employeeDecorator);
    }

    @Override
    public void doWork() {
        employeeDecorator.doWork();
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc nhân viên");
    }
}
