package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class QuaTao extends HoaQua {
    private int soluong;
    private String nguongoc;

    public QuaTao(){
        this.nguongoc = "";
        this.soluong = 0 ;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public void gioiThieutao(){//Ham gioi thieu thong tin ve tao
        System.out.println("Tao co rat nhieu loai:");
    }

    public void kiemNguoongoc(HoaQua t1, HoaQua t2){
        if (t1.getNguongoc().equals(t2.getNguongoc()))
            System.out.println("Cung loai");
        else System.out.println("Khac loai");

    }
}
