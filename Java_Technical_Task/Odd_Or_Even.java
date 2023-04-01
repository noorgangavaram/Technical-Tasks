import java.util.Scanner;

public class Odd_Or_Even {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
    }
}
