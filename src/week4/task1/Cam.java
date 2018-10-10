package week4.task1;

public class CamSanh extends QuaCam{
    private double can;
    private String soluong;
//khai bao phuong thuc can
    public double getCan() {
        return can;
    }

    public void setCan(double can) {
        this.can = can;
    }
 //  khai bao phuong thuc so luong
    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public void gioiThieucamsanh(CamCaoPhong c1){
        //in ra thong tin cua hoa qua bao gom ngay nhap va so luong
        System.out.println("Ngay nhap" + c1.getNoinhap() + ", So luong nhap: " + getSoluong());
    }
}
