package vn.edu.iuh.hero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tao khoa CNTT
        Khoa khoaCNTT = new Khoa();

        //Tao lop hoc
        LopHoc lopHocIT1 = new LopHoc("Lớp học IT 1");

        //Them lop vao khoa
        khoaCNTT.addLopHoc(lopHocIT1);

        //Tao sinh vien
        SinhVien svA = new SinhVien("Sinh Vien A");
        SinhVien svB = new SinhVien("Sinh Vien B");
        SinhVien svC = new SinhVien("Sinh Vien C");

        //Thêm sinh vien vao lop hoc
        lopHocIT1.registerObserver(svA);
        lopHocIT1.registerObserver(svB);
        lopHocIT1.registerObserver(svC);

        //Sinh vien A là lớp trưởng và thông báo ngày mai nghỉ học!
        lopHocIT1.notifyObservers("Ngày mai nghỉ hoc nha các bạn!");

        //Xoa svC khỏi lớp
        lopHocIT1.removeObserver(svC);
        System.out.println("=============================================");
        //Gửi lại một thông báo mới cho lớp xem Có nhận được thông báo hay không
        lopHocIT1.notifyObservers("Ngày mốt thi GK nha các bạn!");
    }
}