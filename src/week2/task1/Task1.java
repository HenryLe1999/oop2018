package week2.task1;
public class Task1 {

    public static int gcd(int a, int b) {
        int tcm;
        while(b!=0){
            tcm = a%b;
            a = b;
            b = tcm;
        }
        return a;

    }

    public static int fibonacci(int n) {
        if(n==1||n==0) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int a= 4;
        int b=6;
        System.out.println(gcd(a,b));
        System.out.println(fibonacci(5));
    }
}
