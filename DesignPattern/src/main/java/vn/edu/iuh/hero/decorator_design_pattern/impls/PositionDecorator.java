/*
 * @ (#) PositionDecorator.java    1.0    3/4/2025
 *
 *
 */

package vn.edu.iuh.hero.decorator_design_pattern.impls;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/4/2025
 * @Version: 1.0
 *
 */

import vn.edu.iuh.hero.decorator_design_pattern.EmployeeDecorator;

abstract public class PositionDecorator implements EmployeeDecorator {
    protected EmployeeDecorator employeeDecorator;

    public PositionDecorator(EmployeeDecorator employeeDecorator) {
        this.employeeDecorator = employeeDecorator;
    }

    @Override
    public void doWork() {
        employeeDecorator.doWork();
    }
}
