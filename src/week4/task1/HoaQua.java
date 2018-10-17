package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class HoaQua {
    private int khoiluong;
    private String mausac;

    public HoaQua(){
        this.khoiluong = 0;
        this.mausac = "";
    }

    public HoaQua(int kg, String m){
        this.khoiluong = kg;
        this.mausac = m;
    }
    public int getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(int khoiluong) {
        this.khoiluong= khoiluong;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public void Thuonghieu(){
        System.out.println("Hoa qua an rat ngon");
    }

    public boolean soSanhMausac(HoaQua hq1, HoaQua hq2){
        //so sanh mau sac 2 loai hoa qua
        return hq1.getMausac() == hq2.getMausac();

    }
}
   
