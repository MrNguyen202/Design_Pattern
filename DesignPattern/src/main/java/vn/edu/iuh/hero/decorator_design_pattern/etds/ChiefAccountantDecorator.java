/*
 * @ (#) ChiefAccountantDecorator.java    1.0    3/4/2025
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

public class ChiefAccountantDecorator extends PositionDecorator {
    public ChiefAccountantDecorator(EmployeeDecorator employeeDecorator) {
        super(employeeDecorator);
    }

    @Override
    public void doWork() {
        employeeDecorator.doWork();
        System.out.println("- Lập báo cáo tài chính");
        System.out.println("- Kiểm tra sổ sách");
    }
}
