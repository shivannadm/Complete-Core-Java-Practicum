package OOPs.Encapsulation;

public class BankAccount {

    private String accHolder;
    public double balance;

    public void setAcc(String accHolder, double balance){
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public void deposit(double ammount){
        if(ammount>0){
            balance+=ammount;
        }
    }

    public double withdraw(double ammount){
        if(ammount>0&&balance>=ammount){
            balance-=ammount;
        }else{
            System.out.println("Balance Insufficient!");
        }
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcc("Alice", 1000);
        ba.deposit(1500);
        ba.withdraw(800);
        System.out.println("Current balnce is: $"+ba.withdraw(80000));
    }
    
}
