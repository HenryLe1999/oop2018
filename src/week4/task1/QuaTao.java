package week4.task1;

public class QuaTao extends HoaQua {
    //khai bao thuoc tinh cua QuaTao
    private int soluong;
    private String mausac;

    public QuaTao(){
        this.mausac = "";
        this.soluong = 0 ;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public void gioiThieutao(){//Ham gioi thieu thong tin ve tao
        System.out.println("Tao co rat nhieu loai:");
    }

    public void kiemTraten(HoaQua t1, HoaQua t2){
        //kiem tra xem 2 qua co cung 1 loai hay khong
        //neu cung loai thi in Cung loai
        //neu khong cung loai thi in Khac loai
        if (t1.getTenqua().equals(t2.getTenqua()))
            System.out.println("Cung loai");
        else System.out.println("Khac loai");

    }
}
