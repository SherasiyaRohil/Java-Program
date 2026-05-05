import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year= Sc.nextInt();
        if (year % 2 == 0 && year % 4 == 0 && year% 100 != 0) {
            System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
        }
    }
}
