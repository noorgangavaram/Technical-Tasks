import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String args[]) {
        int a = 0, b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
