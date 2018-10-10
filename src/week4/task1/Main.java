package week4.task1;

public class Main {
    public static void main(String[] args) {

        HoaQua h = new HoaQua();
        HoaQua h2 = new HoaQua("qua Cam", "NInh BInh");
        HoaQua h1 = new HoaQua("qua Tao","NInh Binh");
        h.gioiThieu();//in ra thong tin cua h tu ham gioiThieu
        System.out.println("\n");
        QuaCam c = new QuaCam();
        QuaCam c1 = new QuaCam("Nghe an",10);
        QuaCam c2 = new QuaCam("Da Nang",20);
        c.gioiThieu();//in ra thong tin cua c tu ham gioiThieu
        c.kiemTra(c1,c2);//kiem tra xem c1 c2 co cung noi khong
        System.out.println("\n");
        CamCaoPhong cp = new CamCaoPhong();
        CamCaoPhong cam1 = new CamCaoPhong();
        cam1.setTenqua("Cam Cao Phong NinhBinh");
        cam1.setNoinhap("NInh BInh");
        CamCaoPhong cam2 = new CamCaoPhong();
        cam2.setTenqua("Cam Cao Phong Ha Noi");
        cam2.setNoinhap("Ha NOi");
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
