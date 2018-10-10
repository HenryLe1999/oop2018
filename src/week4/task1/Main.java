package week4.task1;

public class Main {
    public static void main(String[] args) {

        HoaQua h = new HoaQua();
        HoaQua h2 = new HoaQua("qua Cam", "Hai Duong");
        HoaQua h1 = new HoaQua("qua Tao","Hai Duong");
        h.gioiThieu();//in ra thong tin cua h tu ham gioiThieu
        System.out.println("\n");
        QuaCam c = new QuaCam();
        QuaCam c1 = new QuaCam("Ha Noi",10);
        QuaCam c2 = new QuaCam("Hai Duong",20);
        c.gioiThieu();//in ra thong tin cua c tu ham gioiThieu
        c.kiemTra(c1,c2);//kiem tra xem c1 c2 co cung noi khong
        System.out.println("\n");
        CamCaoPhong cp = new CamCaoPhong();
        CamCaoPhong cam1 = new CamCaoPhong();
        cam1.setTenqua("Cam Cao Phong hd");
        cam1.setNoinhap("Hai Duong");
        CamCaoPhong cam2 = new CamCaoPhong();
        cam2.setTenqua("Cam Cao Phong hy");
        cam2.setNoinhap("Hung Yen");
        CamCaoPhong cam = new CamCaoPhong(20,"ngot");
        cp.gioiThieucamcaophong(cam);
        System.out.println("\n");
        cp.inCamcaophong(cam1,cam2);

        System.out.println("\n");
        QuaTao t = new QuaTao();
        t.gioiThieutao();
        t.kiemTraten(h1,h2);
    }
}
