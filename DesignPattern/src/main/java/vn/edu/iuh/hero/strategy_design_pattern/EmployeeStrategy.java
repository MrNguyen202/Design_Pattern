/*
 * @ (#) EmployeeStrategy.java    1.0    3/4/2025
 *
 *
 */

package vn.edu.iuh.hero.strategy_design_pattern;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/4/2025
 * @Version: 1.0
 *
 */

public class EmployeeStrategy {
    private String name;
    private WorkStrategy strategy;

    public EmployeeStrategy(String name, WorkStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // Setter để thay đổi chiến lược tại runtime
    public void setStrategy(WorkStrategy strategy) {
        this.strategy = strategy;
    }

    // Phương thức thực hiện công việc dựa trên chiến lược hiện tại
    public void doWork() {
        strategy.doWork(name);
    }
}
