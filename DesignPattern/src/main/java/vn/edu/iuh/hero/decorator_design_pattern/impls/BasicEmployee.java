/*
 * @ (#) BasicEmployee.java    1.0    3/4/2025
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

public class BasicEmployee implements EmployeeDecorator {
    private String name;

    public BasicEmployee(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " (Nhân viên cơ bản) phải làm:");
        System.out.println("- Làm việc chung");
    }
}
