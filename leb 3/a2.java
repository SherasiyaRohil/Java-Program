
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter a number: ");
        num = Sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
    
        }
    }
}
