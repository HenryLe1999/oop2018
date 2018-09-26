package week2.task1;


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
        int a=0,b=1,c;
        for(int i=1;i<n;i++)
        {
            c= a + b;
            a = b;
            b= c;
        }
        return c;
    }
}