package oop;
import java.util.*;
class service {
    String str;
    int am = 0;
    int acno;
    public service(String str, int am,int acno) {
        this.str = str;
        this.am = am;
        this.acno=acno;
    }
    boolean pin(int n){
        return acno==n;
    }
    void dis() {
        System.out.println("Account Name : " + str);
        System.out.println("Current Amount : " + am);
    }
    void balance() {
        System.out.println("Balance amount : " + am);
    }
    void deposite(int n) {
            System.out.println("Deposit amount : " + n);
            am += n;
            System.out.println("Current balance : " + am);
    }
    void withdraw(int n) {
        if (n > am) {
            System.out.println("Insufficient balance.");
        } else {
            am -= n;
            System.out.println("Withdraw : " + n);
            System.out.println("Current balance : " + am);
        }
    }
}
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Name : ");
        String str = sc.nextLine();
        System.out.print("Enter the new pin : ");
        int acno = sc.nextInt();
        System.out.print("Enter the amount you want to deposit : ");
        int am = sc.nextInt();
        service s = new service(str,am,acno); // Create once here
        int choice;
        System.out.print("Enter the user pin : ");
        int i=sc.nextInt();
        if(s.pin(i)){
            do {
                System.out.println("Enter the option...");
                System.out.println("Option 1: Account details");
                System.out.println("Option 2: Balance");
                System.out.println("Option 3: Deposit");
                System.out.println("Option 4: Withdrawal");
                System.out.println("Option 5: Exit");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the pin : ");
                        int x=sc.nextInt();
                        if(s.pin(x)){
                            //System.out.println("Enter Account Number pin");
                            s.dis();}
                        else{
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 2:
                        System.out.print("Enter the pin : ");
                        int t=sc.nextInt();
                        if(s.pin(t)){
                            s.balance();}
                        else{
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 3:
                        System.out.print("Enter the pin : ");
                        int o=sc.nextInt();
                        if(s.pin(o)){
                            System.out.print("Enter the deposit amount: ");
                            int dep = sc.nextInt();
                            s.deposite(dep);
                        }
                        else{
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 4:
                        System.out.print("Enter the pin : ");
                        int v=sc.nextInt();
                        if(s.pin(v)){
                            System.out.print("Enter the withdrawal amount: ");
                            int wd = sc.nextInt();
                            s.withdraw(wd);}
                        else{
                            System.out.println("Invalid pin");
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using our service");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 5);
        }
      else{
          System.out.println("Invalid user");
        }
    }
}
