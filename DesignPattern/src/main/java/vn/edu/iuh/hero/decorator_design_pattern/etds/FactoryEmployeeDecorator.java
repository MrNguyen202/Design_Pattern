/*
 * @ (#) FactoryEmployeeDecorator.java    1.0    3/4/2025
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

public class FactoryEmployeeDecorator extends PositionDecorator {
    public FactoryEmployeeDecorator(EmployeeDecorator employeeDecorator) {
        super(employeeDecorator);
    }

    @Override
    public void doWork() {
        employeeDecorator.doWork();
        System.out.println("- Sản xuất");
        System.out.println("- Vận hành máy");
    }
}
