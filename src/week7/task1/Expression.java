package week7.task1;

public abstract class  Expression {

    public abstract String toString();

    public abstract int evaluate();


}

class ExpressionTest {

    public static void main(String[] args) {

        Numeral a = new Numeral(10);
        Numeral b = new Numeral(20);
        Numeral c = new Numeral(6);
        Numeral d = new Numeral(3);

        Square squareOfTen = new Square(a);

        Subtraction subtraction1 = new Subtraction(squareOfTen, b);

        Multiplication multiplication = new Multiplication(c, d);

        Addition addition2 = new Addition(subtraction1, multiplication);
        System.out.println("Ket qua cuar bieu thuc: (10^2 - 1 + 2*3)^2 la: ");
        System.out.println(new Square(addition2).evaluate());


        Subtraction subtraction = new Subtraction(a, c);
        System.out.println("Ket qua phep tru la:");
        System.out.println(subtraction.evaluate());


        Multiplication multiplication1 = new Multiplication(a, b);
        System.out.println("Ket qua phep nhan la :");
        System.out.println(multiplication1.evaluate());

        Division division = new Division(a, c);
        System.out.println("Ket qua phep chia la:");
        System.out.println(division.evaluate());


        try {
            Numeral zero = new Numeral(0);
            Division division1 = new Division(d, zero);
            System.out.println(division1.evaluate());
        }
        catch (ArithmeticException e) {
            System.out.println("khong chia duoc 0!");
        }
    }

}
