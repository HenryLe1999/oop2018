package week4.task1;

public class Main {
    public static void main(String[] args) {

        HoaQua h = new HoaQua();
        HoaQua h2 = new HoaQua(800, "Xanh");
        HoaQua h1 = new HoaQua(700,"Vang");
        h.Thuonghieu();//in ra thong tin cua h tu ham gioiThieu
        System.out.println("\n");
        QuaCam c = new QuaCam();
        QuaCam c1 = new QuaCam("Nghe an",10);
        QuaCam c2 = new QuaCam("Da Nang",20);
        c.Thuonghieu();//in ra thong tin cua c tu ham gioiThieu
        c.kiemTra(c1,c2);//kiem tra xem c1 c2 co cung noi khong
        System.out.println("\n");
        CamThanhPhong cp = new CamThanhPhong();
        CamThanhPhong cam1 = new CamThanhPhong();
        cam1.setKhoiluong(600);
        cam1.setHuongvi("Ngot");
        CamThanhPhong cam2 = new CamThanhPhong();
        cam2.setKhoiluong(500);
        cam2.setHuongvi("Chua");
        CamThanhPhong cam = new CamThanhPhong(600,"ngot");
        cp.gioiThieucamcaophong(cam);
        System.out.println("\n");
        cp.inCamThanhphong(cam1,cam2);

        System.out.println("\n");
        QuaTao t = new QuaTao();
        t.gioiThieutao();
        t.kiemTraten(h1,h2);
    }
}
