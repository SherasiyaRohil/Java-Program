import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0;
        double average;
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        average = (double) sum / 5;
        System.out.println("Average marks: " + average);
        if (average >= 60) {
            System.out.println("Division: First");
            } else if (average >= 50) {
            System.out.println("Division: Second");
        } else if (average >= 40) {
            System.out.println("Division: Third");
            } else {
            System.out.println("Division: Fail");
    
            }
    }
}
