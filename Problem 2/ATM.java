import java.util.*;

public class ATM {
    static class Account {
        int accountno=6201;
        int amount=10000;
    }

    static class Balance extends Account{
        void display(){
            System.out.println("Account number:"+ accountno );
            System.out.println("Balance:"+ amount );
        }
    }

    static class Deposit extends Account{
        void deposit(int an,int a){
            for (int i=0;i<3;i++){
                if (accountno==an ){
                    amount+=a;
                    System.out.println("Deposit amount:"+ a);
                    System.out.println("Balance:"+ amount );
                    break;
                }
                else{
                    System.out.println("Invalid account number or pin number");
                }
            }
        
        }
    } 

    static class Withdraw extends Account{
        void withdraw(int an,int a){
            for (int i=0;i<3;i++){
                if ( amount>=a){
                    amount-=a;
                    System.out.println("Withdraw amount:"+ a);
                    System.out.println("Balance:"+ amount );
                    break;
                }
                else{
                    System.out.println("Invalid account number or insufficient balance" );
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter account no");
        int an =s.nextInt();
        Account acc=new Account();
        if (acc.accountno==an){
            System.out.println("selection options: BALANCE-1, DEPOSIT-2,WITHDRAW-3");
        int option = s.nextInt();

            switch (option) {
                case 1:
                    Balance b = new Balance();
                    b.display();
                    break;
                case 2:
                    Deposit d = new Deposit();
                    System.out.println("Enter amount");
                    int a = s.nextInt();
                    d.deposit(an, a);
                    break;
                case 3:
                    Withdraw w = new Withdraw();
                    System.out.println("Enter amount");
                    int ai = s.nextInt();
                    w.withdraw(an, ai);
                    break;
        
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        else{
            System.out.println("Invalid account number");

        }
        s.close();
    }
}