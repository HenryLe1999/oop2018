package week2.task2;

public class Fraction {
    private int numerator,denominator;
    public void SetNumerator(int a){
        numerator=a;
    }
    public int setNumerator(){
        return numerator;
    }
    public void getDenominator(int b){
        denominator=b;
    }
    public int getDenominator(){
        return denominator;
    }

    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
        this.denominator=denominator;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    public Fraction add(Fraction other) {
        Fraction sum = new Fraction(1,1);
        sum.numerator = this.numerator*other.denominator+other.numerator*this.denominator;
        sum.denominator=this.denominator*other.denominator;
        System.out.println(sum.numerator + "/" + sum.denominator);
        return sum;
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

    }

    public Fraction subtract(Fraction other) {
        Fraction subtract = new Fraction (1,1);
        subtract.numerator=this.numerator*other.denominator-other.numerator*this.denominator;
        subtract.denominator=this.denominator*other.denominator;
        System.out.println(subtract.numerator + "/" + subtract.denominator);
        return subtract;

        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
    }

    public Fraction multiply(Fraction other) {
        Fraction multiply = new Fraction(1,1);
        multiply.numerator=this.numerator*other.numerator;
        multiply.denominator=this.denominator*other.denominator;
        System.out.println(multiply.numerator + "/" + multiply.denominator);
        return multiply;
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

    }

    public Fraction divide(Fraction other) {
        Fraction divide=new Fraction(1,1);
        divide.numerator=this.numerator*other.denominator;
        divide.denominator=this.denominator*other.numerator;
        System.out.println(divide.numerator + "/" + divide.denominator);

        return divide;
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới

    }

    public boolean equals(Object obj){
        Fraction a = (Fraction) obj;
        return (numerator*a.denominator == a.numerator*denominator);

    }

    public static void main(String[] args){
        Fraction a = new Fraction(12,34);
        Fraction b = new Fraction(2,9);
        Fraction c = new Fraction(1,1);



       //*result = a.subtract(b);
       // System.out.println("ket qua phep tru la :" +result);
       // result = a.multiply(b);
      //  System.out.println("ket qua phep nhan la :" +result);
      //  result = a.divide(b);
      //  System.out.println("ket qua phep chia la :"+result);
      //  System.out.println("hai phan so bang nhau :" +a.equals(b));
    }
}
