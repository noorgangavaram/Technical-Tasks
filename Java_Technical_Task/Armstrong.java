import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int result = 0;

        while(temp>0){
            int lasdigit = temp%10;
            result = result+lasdigit*lasdigit*lasdigit;
            temp = temp/10;
        }

        if(result == num){
            System.out.println("Given number is Armstrong ");
        }else {
            System.out.println("Given number is not Armstrong ");
        }

    }
}
