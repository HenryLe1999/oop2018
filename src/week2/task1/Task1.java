package week2.task1;

import java.util.Scanner;

public class Task1 {
        public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);


        // TODO: Tính ước chung lớn nhất của 2 số a, b
        }

    public static int fibonacci(int n) {
            if (n==0 ) return 0;
            else if (n==1) return 1;
            else  {
                return fibonacci(n-1)+fibonacci(n-2);
            }
        // TODO: Tìm số fibonacci ở vị trí n
            }
    public static void main(String[] args){
        int a=6;
        int b=9;
        System.out.println("Uoc chung lon nhat la "+gcd(a,b));
        for (int i=0; i<31; i++){
            System.out.println( +fibonacci(i)+" ");
        }



    }
}
