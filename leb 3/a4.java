import java.util.Scanner;

public class a4 {

        public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.print("Enter a number A: ");
        int a = Sc.nextInt();
        System.out.print("Enter a number B: ");
        int b = Sc.nextInt();
        System.out.print("Enter a number C: ");
        int c = Sc.nextInt();
    
            int max = (a > b)? (a > c)? a : c : (b > c)? b : c;
            System.out.println("Maximum number is: " + max);
            
        }
    
}
