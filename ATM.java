import java.util.Scanner;

class ATM
{
    private int balance = 1000;

    public void deposit(int amount)
    {
        balance = balance + amount;
        System.out.println("Balance: " + balance);
    }

    public void withdraw(int amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdraw successful");
            System.out.println("Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance()
    {
        System.out.println("Balance: " + balance);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM();

        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");

        int choice = sc.nextInt();

        if(choice == 1)
        {
            a.checkBalance();
        }
        else if(choice == 2)
        {
            System.out.println("Enter amount");
            int amt = sc.nextInt();
            a.deposit(amt);
        }
        else if(choice == 3)
        {
            System.out.println("Enter amount");
            int amt = sc.nextInt();
            a.withdraw(amt);
        }
    }
}