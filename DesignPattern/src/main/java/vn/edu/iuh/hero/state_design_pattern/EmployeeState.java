/*
 * @ (#) EmployeeState.java    1.0    3/4/2025
 *
 *
 */

package vn.edu.iuh.hero.state_design_pattern;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/4/2025
 * @Version: 1.0
 *
 */

public class EmployeeState {
    private String name;
    private PositionState state;

    public EmployeeState(String name, PositionState state) {
        this.name = name;
        this.state = state;
    }

    // Setter để thay đổi trạng thái (chức vụ) tại runtime
    public void setState(PositionState state) {
        this.state = state;
    }

    // Phương thức thực hiện công việc dựa trên trạng thái hiện tại
    public void doWork() {
        state.doWork(name);
    }
}
