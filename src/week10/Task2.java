package week10;

import java.util.Random;

public class Task2 {
    public static void doicho(float a, float b){
        float tg = a;
        a = b;
        b = tg;
    }

    public static void main(String [] args){
        float [] a = new float[1000];
        Random rd = new Random();
        for(int i = 0; i<1000;i++)
        {
            a[i] = rd.nextFloat();
        }
        for(int i=0;i<1000;i++)
        {
            for(int j = 0; j < 999; j++)
            {
                if(a[j] > a[j+1])
                    Task2.doicho(a[j],a[j+1]);
            }
        }
        for(int i = 0; i<1000;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}
