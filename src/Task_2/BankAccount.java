package Task_2;

public class BankAccount {
    private String name;
    private double balance;
    private  int depositCount;
    private int withdrawsCount;


//    public BankAccount(double balance, String name){
//        if (balance > 0 )
//            this.balance = balance;
//            this.name = name;
//    }
// shall increase then balanced
    public void deposit (double amount){
        if (amount <= 0){
            System.out.println("Amount to be deposited should be positive");
        }else if (balance >= 100000){
            amount = (amount) + ((amount) * (1/100.0));
        }else {
            balance += amount;
            depositCount++;

        }


    }
// shall decrease the balance.
    public void withdraw (double amount){
        if (amount <= 0){
            System.out.println("Amount to be withdrawn should be positive.");
        } else if (balance < 50000){
            amount = (amount) + ((amount)* (2.0 /100.0));
            balance -= amount;
            withdrawsCount++;
        }

    }

    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return  balance;
    }

    public  int getDepositCount(){
        return depositCount;
    }

    public int getWithdrawsCount(){
        return withdrawsCount;
    }


}
