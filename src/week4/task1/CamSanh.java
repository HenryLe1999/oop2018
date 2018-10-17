package week4.task1;

public class CamSanh extends QuaCam{
    private double can;
    private int soluong;
//khai bao phuong thuc can
    public double getCan() {
        return can;
    }

    public void setCan(double can) {
        this.can = can;
    }
 //  khai bao phuong thuc so luong
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void gioiThieucamsanh(CamThanhPhong c1){
        //in ra thong tin cua hoa qua bao gom ngay nhap va so luong
        System.out.println(" So luong nhap: " + getSoluong());
    }
}
