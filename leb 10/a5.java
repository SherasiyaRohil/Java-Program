//Write a program in java if number is less than 10 and greater than 50, it generate the exception out of range. Else it displays the square of number . take numbr from user input.
import  java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num<10 || num>50){
            throw new IllegalArgumentException("Number is out of range.");
        }
        int square = num * num;
        System.out.println("Square of " + num + " is " + square);
        sc.close();
    }
}
