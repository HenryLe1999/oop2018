package week2.task1;
import java.util.Scanner;

/**
 * Created by CCNE on 26/09/2018.
 */
public class Task1 {
    public static int gcd(int a, int b) {
        while(a!=b)
        {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int a=0,b=1,c = 0;
        for(int i=1;i<n;i++)
        {
            c= a + b;
            a = b;
            b= c;
        }
        return c;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap A: ");
        a= sc.nextInt();
        System.out.println("nhap B:");
        b= sc.nextInt();


        System.out.println("uoc trung lon nhat la: "+ gcd(a,b) );
        System.out.println(fibonacci(a));
    }
}
