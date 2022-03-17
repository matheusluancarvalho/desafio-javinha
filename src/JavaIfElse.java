import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();

        if(N >= 1 && N <= 100){
            System.out.println("Deu certo");

            if(N >= 1 && N <= 5){
                int x = N%2;
                if (x == 0){
                    System.out.println("Not Weird");
                } else {
                    System.out.println("Weird");
                }
            } if (N >= 6 && N <= 20){
                int x = N%2;
                if (x == 0){
                    System.out.println("Not Weird");
                } else {
                    System.out.println("Weird");
                }
            } if (N > 20){
                int x = N%2;
                if (x == 0){
                    System.out.println("Not Weird");
                } else {
                    System.out.println("Weird");
                }
            }
        } else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
