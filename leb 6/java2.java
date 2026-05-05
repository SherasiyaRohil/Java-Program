import java.util.Scanner;

class MyBank{
    int accNum;
    String accType;
    double balance;
    MyBank(){
        this.balance=10000;
    }
    MyBank(int accNum,String accType, double balance){
        this.accNum=accNum;
        this.accType=accType;
        this.balance=10000+balance;
    }
    void creditAmt(double amt){
        this.balance=this.balance+amt;
        System.out.println("Credited amt="+amt);
    }
    double debitAmt(double amt1){
        // this.balance=this.balance-amt1;
        double i=balance;
        i-=balance;
        if(i<20000)
        {
            System.out.println("Cannot debit amt");
        }
        else{
            System.out.println("Debited amt="+amt1);
            this.balance-=amt1;
        }
        return balance;
    }
    void displayBal(){
        System.out.println("Account Number="+accNum+"\nBalance="+balance);
    }
    }
public class MyBankDemoChoice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyBank mb1=new MyBank(1111,"current",10000);
        MyBank mb2=new MyBank(2222,"salary",0);
        MyBank mb3=new MyBank(3333, "saving", 20000);
        MyBank mb4=new MyBank(4444, "saving", 40000);
        System.out.println("Enter one of the folowing choices:");
        int aNum;
        for(int j=0;j<10;)
        {
            System.out.println("1.Check the existing Balance\n2.Debit Amount\n3.Credit Amount\n4.Exit");
            System.out.println("Enter your Choice:");
            int i=sc.nextInt();
            switch (i) {
                case 1:
                    System.out.print("Enter your account number:");
                    aNum=sc.nextInt();
                    if(aNum==1111){
                        mb1.displayBal();
                    }
                    else if(aNum==2222){
                        mb2.displayBal();
                    }
                    else if(aNum==3333){
                        mb3.displayBal();
                    }
                    else if(aNum==4444){
                        mb4.displayBal();
                    }
                break;

                case 2:
                    System.out.print("Enter your account number:");
                    aNum=sc.nextInt();
                    if(aNum==1111){
                        System.out.print("Enter the amount to be debited:");        
                        double amt1=sc.nextDouble();
                        mb1.debitAmt(amt1);
                        mb1.displayBal();
                    }
                    else if(aNum==2222){
                        System.out.print("Enter the amount to be debited:");        
                        double amt1=sc.nextDouble();
                        mb2.debitAmt(amt1);
                        mb2.displayBal();
                    }
                    else if(aNum==3333){
                        System.out.print("Enter the amount to be debited:");        
                        double amt1=sc.nextDouble();
                        mb3.debitAmt(amt1);
                        mb3.displayBal();
                    }
                    else if(aNum==4444){
                        System.out.print("Enter the amount to be debited:");        
                        double amt1=sc.nextDouble();
                        mb4.debitAmt(amt1);
                        mb4.displayBal();
                    }
                break;
                case 3:
                    System.out.print("Enter your account number:");
                    aNum=sc.nextInt();
                    if(aNum==1111)
                    {
                        System.out.println("Enter the amount to be debited:");        
                        int amt1=sc.nextInt();
                        mb1.debitAmt(amt1);
                        mb1.displayBal();
                    }
                    else if(aNum==2222)
                    {
                        System.out.println("Enter the amount to be debited:");        
                        int amt1=sc.nextInt();
                        mb2.debitAmt(amt1);
                        mb2.displayBal();
                    }
                    else if(aNum==3333)
                    {
                        System.out.println("Enter the amount to be debited:");        
                        int amt1=sc.nextInt();
                        mb3.debitAmt(amt1);
                        mb3.displayBal();
                    }
                    else if(aNum==4444)
                    {
                        System.out.println("Enter the amount to be debited:");        
                        int amt1=sc.nextInt();
                        mb4.debitAmt(amt1);
                        mb4.displayBal();
                    }
                break;
                case 4:
                    System.exit(0);
                break;
            }
        }
    }
}
