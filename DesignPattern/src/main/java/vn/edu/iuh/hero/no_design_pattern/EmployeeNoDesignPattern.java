/*
 * @ (#) EmployeeNoDesignPattern.java    1.0    3/4/2025
 *
 *
 */

package vn.edu.iuh.hero.no_design_pattern;
/*
 * @Description:
 * @Author: Nguyen Thanh Thuan
 * @Date: 3/4/2025
 * @Version: 1.0
 *
 */

public class EmployeeNoDesignPattern {
    private String name;
    private String position;

    public EmployeeNoDesignPattern(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void doWork() {
        System.out.println(name + " (" + position + ") phải làm:");
        switch (position) {
            case "Đội Trưởng":
                System.out.println("- Đi tuần");
                System.out.println("- Gán việc nhân viên");
                break;
            case "Giám đốc":
                System.out.println("- Ký duyệt");
                System.out.println("- Họp hội đồng");
                break;
            case "Nhân viên VP":
                System.out.println("- Pha trà");
                System.out.println("- Phê duyệt giấy tờ");
                break;
            case "Nhân Viên Xưởng":
                System.out.println("- Sản xuất");
                System.out.println("- Vận hành máy");
                break;
            case "Kế Toán Trưởng":
                System.out.println("- Lập báo cáo tài chính");
                System.out.println("- Kiểm tra sổ sách");
                break;
            default:
                System.out.println("- Không có công việc nào");
        }
    }
}
