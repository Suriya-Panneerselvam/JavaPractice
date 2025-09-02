import java.util.*;

public class ATM {
    static class Account {
        HashMap<Integer, Integer> hm = new HashMap<>();
        {
            hm.put(6201, 10000);
            hm.put(6202, 5800);
            hm.put(6203, 12000);
        }
    }

    static class Balance extends Account{
        void display(int an){
            if (hm.containsKey(an) ){
                System.out.println("Account number:"+ an );
                System.out.println("Balance:"+ hm.get(an) );
            }
            else{
                System.out.println("Invalid account number");
            }
        }
    }

    static class Deposit extends Account{
        void deposit(int an,int a){
                if (hm.containsKey(an) ){
                    int amount = hm.get(an);
                    amount+=a;
                    hm.put(an, amount);
                    System.out.println("Deposit amount:"+ a);
                    System.out.println("Balance:"+ amount );
                }
                else{
                    System.out.println("Invalid account number or pin number");
                }        
        }
    } 

    static class Withdraw extends Account{
        void withdraw(int an,int a){
            int amount = hm.get(an);
            
                if ( amount>=a){
                    amount-=a;
                    hm.put(an, amount);
                    System.out.println("Withdraw amount:"+ a);
                    System.out.println("Balance:"+ amount );
                }
                else{
                    System.out.println("Invalid account number or insufficient balance" );
                }
        }
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter account no");
        int an =s.nextInt();
        Account acc=new Account();
        if (acc.hm.containsKey(an)){
            while (true){
                System.out.println("selection options: BALANCE-1, DEPOSIT-2,WITHDRAW-3");
                int option = s.nextInt();

                switch (option) {
                    case 1:
                        Balance b = new Balance();
                        b.display(an);
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

                System.out.println("Do you want to continue? (yes/no)");
                String ch = s.next().toLowerCase();
                if (ch.equals("no")){
                    break;
                }
            }
        }
        else{
            System.out.println("Invalid account number");
        }
        s.close();
    }
}