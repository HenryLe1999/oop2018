package week4.task1;

public class CamThanhPhong extends QuaCam {//cam cao phong ke thua tu QuaCam
    private int khoiluong;
    private String huongvi;

    public CamThanhPhong(int x, String hv){
        this.khoiluong = x;
        this.huongvi = hv;
    }

    public CamThanhPhong(){
        this.khoiluong = 0;
        this.huongvi = "";
    }

    public int getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(int khoiluong) {
        this.khoiluong = khoiluong;
    }

    public String getHuongvi() {
        return huongvi;
    }

    public void setHuongvi(String huongvi) {
        this.huongvi = huongvi;
    }


    public void gioiThieucamcaophong(CamThanhPhong s){
        System.out.println("Cam cao phong co vi " + s.getHuongvi());//in ra huong vi cam cao phong
        System.out.println("Cam cao phong khoi luong " + s.getKhoiluong());//in ra khoi luong cam cao phong
    }

    public void inCamcaophong( CamThanhPhong c1, CamThanhPhong c2){//in thong tin cua hoa qua va noi nhap cua no
        System.out.println(c1.getMausac()+", Khoi luong:  " + c1.getKhoiluong());
        System.out.println(c2.getMausac()+", khoi luong:  " + c2.getKhoiluong());
    }

}
