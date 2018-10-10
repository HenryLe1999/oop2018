package week4.task2;


public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        Square sq1 = new Square(3,"blue",true);
        System.out.println(sq1.getSide());
        System.out.println(sq1.getColor());
        System.out.println(sq1.isFilled());
        System.out.println('\n');

        Rectangle r = new Rectangle();
        r.setWidth(4);
        r.setLength(5);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());


        sq.setLength(2);
        sq.setWidth(3);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());

        System.out.println("\n");
        Circle c = new Circle();
        c.setRadius(1.5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());


    }
}
