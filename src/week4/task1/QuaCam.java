package week4.task1;

public class QuaCam extends HoaQua {
    //ke thua tu HoaQua
    //khai bao thuoc tinh cua QuaCam
    private int giaban;
    private String noiban;

    public QuaCam(){
        this.giaban = 0;
        this.noiban = "";
    }

    public QuaCam(String xx, int  y ){
        super("","");
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getNoiban() {
        return noiban;
    }

    public void setNoiban(String noiban) {
        this.noiban = noiban;
    }
    public void kiemTra(QuaCam c1, QuaCam c2){//ham kiem tra xem 2 qua co cung noi ban khong
        if (soSanhnoi(c1,c2)){
            System.out.println("Nhap cung noi");
        }else{
            System.out.println("Nhap khac noi");
        }
    }
}
