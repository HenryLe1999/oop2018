package week7.task2;

import week7.task1.Addition;
import week7.task1.BinaryExpression;
import week7.task1.Numeral;
import week7.task1.Square;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

    public void printLengthOfString(String string) throws NullPointerException {
        System.out.println(string.length());
    }

    public void printArray(int[] array) throws ArrayIndexOutOfBoundsException {
        for (int i=0; i<=array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void divide(int a, int b) throws ArithmeticException {
        System.out.println("a/b = " + a/b);
    }

    public void castObject(Object object) throws ClassCastException {
        System.out.println((String) object);
    }

    public void readFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String lineData;
        while ((lineData = br.readLine()) != null) {
            System.out.println(lineData);
        }
        br.close();
    }

    public void openFile(String filePath) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
    }

    public static void main(String[] args) {
        Task2 example = new Task2();

        try {
            example.printLengthOfString(null);
        } catch (NullPointerException loi) {
            System.out.println("Gap loi: " + loi);
        }

        try {
            int[] a = {1, 2, 3};
            example.printArray(a);
        } catch (ArrayIndexOutOfBoundsException loi) {
            System.out.println("Gap loi: " + loi);
        }

        try {
            example.divide(9, 0);
        } catch (ArithmeticException loi) {
            System.out.println("Gap loi: " + loi.getMessage());
        }

        try {
            example.castObject(10);
        } catch (ClassCastException loi) {
            System.out.println("Gap loi: " + loi.getMessage());
        }

        try {
            example.readFile("C://");
        } catch (IOException loi) {
            System.out.println("Gap loi: " + loi.getMessage());
        }

        try {
            example.openFile("C://file.txt");
        }

        catch (FileNotFoundException loi) {
            System.out.println("Gap loi: " + loi.getMessage());
        }
    }

}
