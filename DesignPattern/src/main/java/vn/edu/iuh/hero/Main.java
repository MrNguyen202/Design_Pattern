package vn.edu.iuh.hero;

import vn.edu.iuh.hero.decorator_design_pattern.EmployeeDecorator;
import vn.edu.iuh.hero.decorator_design_pattern.etds.*;
import vn.edu.iuh.hero.decorator_design_pattern.impls.BasicEmployee;
import vn.edu.iuh.hero.no_design_pattern.EmployeeNoDesignPattern;
import vn.edu.iuh.hero.state_design_pattern.EmployeeState;
import vn.edu.iuh.hero.state_design_pattern.impls.*;
import vn.edu.iuh.hero.strategy_design_pattern.EmployeeStrategy;
import vn.edu.iuh.hero.strategy_design_pattern.impls.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //NO DESIGN PATTERN
        System.out.println("<==============================NO DESIGN PATTERN=====================================>");
        EmployeeNoDesignPattern employee1 = new EmployeeNoDesignPattern("Nguyễn Văn A", "Đội Trưởng");
        EmployeeNoDesignPattern employee2 = new EmployeeNoDesignPattern("Nguyễn Văn B", "Giám đốc");
        EmployeeNoDesignPattern employee3 = new EmployeeNoDesignPattern("Nguyễn Văn C", "Nhân viên VP");
        EmployeeNoDesignPattern employee4 = new EmployeeNoDesignPattern("Nguyễn Văn D", "Nhân Viên Xưởng");
        EmployeeNoDesignPattern employee5 = new EmployeeNoDesignPattern("Nguyễn Văn E", "Kế Toán Trưởng");

        employee1.doWork();
        employee2.doWork();
        employee3.doWork();
        employee4.doWork();
        employee5.doWork();


        //STATE DESIGN PATTERN
        System.out.println("<==============================STATE DESIGN PATTERN=====================================>");
        // Tạo nhân viên với chức vụ Đội Trưởng
        EmployeeState emp1 = new EmployeeState("Nguyễn Văn A", new TeamLeaderState());
        emp1.doWork();

        // Tạo nhân viên với chức vụ Giám đốc
        EmployeeState emp2 = new EmployeeState("Trần Thị B", new DirectorState());
        emp2.doWork();

        // Tạo nhân viên với chức vụ Nhân viên VP
        EmployeeState emp3 = new EmployeeState("Lê Văn C", new OfficeEmployeeState());
        emp3.doWork();

        // Tạo nhân viên với chức vụ Nhân Viên Xưởng
        EmployeeState emp4 = new EmployeeState("Phạm Thị D", new FactoryEmployeeState());
        emp4.doWork();

        // Tạo nhân viên với chức vụ Kế Toán Trưởng
        EmployeeState emp5 = new EmployeeState("Hoàng Văn E", new ChiefAccountantState());
        emp5.doWork();

        // Thay đổi trạng thái của emp1 sang Giám đốc để minh họa tính linh hoạt
        System.out.println("Thay đổi trạng thái của Nguyễn Văn A sang Giám đốc để minh họa tính linh hoạt");
        emp1.setState(new DirectorState());
        emp1.doWork();


        //STRATEGY DESIGN PATTERN
        System.out.println("<==============================STRATEGY DESIGN PATTERN=====================================>");
        // Tạo nhân viên với chiến lược Đội Trưởng
        EmployeeStrategy employeeStrategy1 = new EmployeeStrategy("Nguyễn Văn A", new TeamLeaderWork());
        employeeStrategy1.doWork();

        // Tạo nhân viên với chiến lược Giám đốc
        EmployeeStrategy employeeStrategy2 = new EmployeeStrategy("Trần Thị B", new DirectorWork());
        employeeStrategy2.doWork();

        // Tạo nhân viên với chiến lược Nhân viên VP
        EmployeeStrategy employeeStrategy3 = new EmployeeStrategy("Lê Văn C", new OfficeEmployeeWork());
        employeeStrategy3.doWork();

        // Tạo nhân viên với chiến lược Nhân Viên Xưởng
        EmployeeStrategy employeeStrategy4 = new EmployeeStrategy("Phạm Thị D", new FactoryEmployeeWork());
        employeeStrategy4.doWork();

        // Tạo nhân viên với chiến lược Kế Toán Trưởng
        EmployeeStrategy employeeStrategy5 = new EmployeeStrategy("Hoàng Văn E", new ChiefAccountantWork());
        employeeStrategy5.doWork();

        // Thay đổi chiến lược của emp1 sang Giám đốc để minh họa tính linh hoạt
        System.out.println("Thay đổi chiến lược của Nguyễn Văn A sang Giám đốc để minh họa tính linh hoạt");
        employeeStrategy1.setStrategy(new DirectorWork());
        employeeStrategy1.doWork();


        //DECORATOR DESIGN PATTERN
        System.out.println("<==============================DECORATOR DESIGN PATTERN=====================================>");
        // Nhân viên cơ bản
        EmployeeDecorator basicEmp = new BasicEmployee("Nguyễn Văn Basic");
        basicEmp.doWork();

        // Nhân viên với chức vụ Đội Trưởng
        EmployeeDecorator teamLeader = new TeamLeaderDecorator(new BasicEmployee("Nguyễn Văn A"));
        teamLeader.doWork();

        // Nhân viên với chức vụ Giám đốc
        EmployeeDecorator director = new DirectorDecorator(new BasicEmployee("Trần Thị B"));
        director.doWork();

        // Nhân viên với chức vụ Nhân viên VP
        EmployeeDecorator officeEmp = new OfficeEmployeeDecorator(new BasicEmployee("Lê Văn C"));
        officeEmp.doWork();

        // Nhân viên với chức vụ Nhân Viên Xưởng
        EmployeeDecorator factoryEmp = new FactoryEmployeeDecorator(new BasicEmployee("Phạm Thị D"));
        factoryEmp.doWork();

        // Nhân viên với chức vụ Kế Toán Trưởng
        EmployeeDecorator chiefAccountant = new ChiefAccountantDecorator(new BasicEmployee("Hoàng Văn E"));
        chiefAccountant.doWork();

        // Kết hợp nhiều Decorator (ví dụ: vừa là Đội Trưởng vừa là Kế Toán Trưởng)
        System.out.println("Kết hợp nhiều Decorator (ví dụ: vừa là Đội Trưởng vừa là Kế Toán Trưởng)");
        EmployeeDecorator combined = new ChiefAccountantDecorator(new TeamLeaderDecorator(new BasicEmployee("Nguyễn Văn F")));
        combined.doWork();
    }
}