package week1;

public class Fraction {

    public Fraction(int numerator, int denominator) {
        // TODO: kh?i t?o giá tr? cho các thu?c tính numberator (t? s?), denominator (m?u s?)
        this.tu = numerator;
        this.mau = denominator;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public Fraction add(Fraction other) {
        // TODO: Phuong th?c c?ng hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        int ts = this.getTu() * other.getMau() + other.getTu() * this.getMau();
        int ms = this.getMau() * other.getMau();
        Fraction tong = new Fraction(ts, ms);
        tong.toiGianPhanSo();
        return tong;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phuong th?c tr? hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        int ts = this.getTu() * other.getMau() - other.getTu() * this.getMau();
        int ms = this.getMau() * other.getMau();
        Fraction hieu = new Fraction(ts, ms);
        hieu.toiGianPhanSo();
        return hieu;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phuong th?c nhân hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        int ts = this.getTu() * other.getTu();
        int ms = this.getMau() * other.getMau();
        Fraction tich = new Fraction(ts, ms);
        tich.toiGianPhanSo();
        return tich;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phuong th?c chia hai phân s? (this và other), tr? v? d?i tu?ng Fraction m?i
        int ts = this.getTu() * other.getMau();
        int ms = this.getMau() * other.getTu();
        Fraction thuong = new Fraction(ts, ms);
        thuong.toiGianPhanSo();

        return thuong;
    }

    public boolean equals(Fraction obj) {
        int ts = this.getTu() * obj.getMau();
        int ms = this.getMau() * obj.getTu();
        if (ts == ms) return true;

        return false;
    }
    public String toString() {
        return tu + "/" + mau;
    }

    public static void main(String[] args){
        Fraction a= new Fraction(2,3);
        Fraction b= new Fraction(5,6);
        System.out.println("tong hai phan so la :" + a.add(b).toString());
        System.out.println("hieu hai phan so la : " + a.subtract(b).toString());
        System.out.println("tich hai phan so la : " + a.multiply(b).toString());
        System.out.println("thuong hai phan so la : " + a.divide(b).toString());
        if (a.equals(b)) {
            System.out.println("hai phan so bang nhau");
        } else {
            System.out.println("hap phan so khac nhau");
        } 

    }

}
