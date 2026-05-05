import java.util.Scanner;

public  class a5{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Sc.nextInt();
        
        boolean flag = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag = false;
                break;
        
                }
            }
            if(flag==true){
                System.out.println(n+" is a prime number");
                }else{
                System.out.println(n+" is not a prime number");
            }
            
    }
}