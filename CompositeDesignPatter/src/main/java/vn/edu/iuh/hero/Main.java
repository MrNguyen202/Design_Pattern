package vn.edu.iuh.hero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tao quan cafe Go Vap
        Quan quan = new Quan("Go Vap");

        //Tao khu vuc cho quan cafe Go Vap
        KhuVuc khuVucA = new KhuVuc("Khu vuc A");
        KhuVuc khuVucB = new KhuVuc("Khu vuc B");

        //Them khu cho quan
        quan.themKhuVuc(khuVucA);
        quan.themKhuVuc(khuVucB);

        //Tao ban cho từng khu vực
        Ban ban1 = new Ban(1);
        Ban ban2 = new Ban(2);
        Ban ban3 = new Ban(3);
        Ban ban4 = new Ban(4);
        Ban ban5 = new Ban(5);

        //Them ban cho từng khu vực
        khuVucA.themBan(ban1);
        khuVucA.themBan(ban2);
        khuVucA.themBan(ban3);

        khuVucB.themBan(ban4);
        khuVucB.themBan(ban5);

        //Tao san pham cho từng bàn
        SanPham cafe = new SanPham("Cafe", 15000);
        SanPham nuocEp = new SanPham("Nuoc ep", 20000);
        SanPham traSua = new SanPham("Tra sua", 25000);
        SanPham nuocSuoi = new SanPham("Nuoc suoi", 5000);
        SanPham traDa = new SanPham("Tra da", 10000);

        //Them san pham cho từng bàn
        ban1.themSanPham(cafe);  //1500
        ban1.themSanPham(nuocEp); //20000

        ban2.themSanPham(traSua); //25000
        ban2.themSanPham(nuocSuoi); //5000
        ban2.themSanPham(traDa); //10000

        ban3.themSanPham(cafe); //15000
        ban3.themSanPham(nuocSuoi); //5000

        ban4.themSanPham(traDa); //10000
        ban4.themSanPham(nuocSuoi); //5000

        ban5.themSanPham(cafe); //15000
        ban5.themSanPham(traSua); //25000
        ban5.themSanPham(nuocSuoi); //5000
        ban5.themSanPham(traDa); //10000
        ban5.themSanPham(nuocEp); //20000

        System.out.println("Tong doanh thu của quán: " + quan.getPrice());
    }
}