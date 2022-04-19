package Lecture_19_Polymorphism_2;

public class TestApp {
    public static void main(String[] args) {
    CommissionEmployee commissionEmployee = new CommissionEmployee(1,"Ali",0.03,300000);

    commissionEmployee.setBankAccountNumber(10);
    Accounts accounts = new Accounts();
    HourlyEmployee hourlyEmployee = new HourlyEmployee(2,"abid",160,10);
    hourlyEmployee.setBankAccountNumber(20) ;
    PieceWorker pieceWorker = new PieceWorker(1000,100);
    pieceWorker.setBankAccountNumber(30);

    accounts.depositEarningsIntoAccount(commissionEmployee);
    accounts.depositEarningsIntoAccount(hourlyEmployee);
    accounts.depositEarningsIntoAccount(pieceWorker);
    }
}

