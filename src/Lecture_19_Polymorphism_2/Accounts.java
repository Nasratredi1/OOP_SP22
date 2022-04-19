package Lecture_19_Polymorphism_2;

/*
Most Important point:
In polymorphism we programmed in general not specific
general mean: agr hum parent class likly hamara kam haja ty han ya nahi. agr hoty han to
liklye.

If you want to general our program then why we not write object that's more general
b/c some methods are not initilize there for that.
if you write object class then you have to downcast to employee that class like below.
 */
public class Accounts {
    Bank bank = new Bank();

    final private static int companyAccountNumber = 50;

        public void depositEarningsIntoAccount(Employee employee) {

        if (employee.getBankAccountNumber() <= 0) {
            System.out.println("Invalid Account");
            return;
        }
        bank.transferMoney(companyAccountNumber,
                employee.getBankAccountNumber(), employee.getEarnings());

    }
    // if we Object for generalazition concept
//    public void depositEarningsIntoAccount(Object employee1) {
//        Employee employee = null;
//        // we have to down cast it
//        if(employee1 instanceof  Employee)
//        employee = (Employee) employee1;
//        if (employee.getBankAccountNumber() <= 0) {
//            System.out.println("Invalid Account");
//            return;
//        }
//        bank.transferMoney(companyAccountNumber,
//                employee.getBankAccountNumber(), employee.getEarnings());
//
//    }
}

//        public void depositEarningsIntoAccount(CommissionEmployee commissionEmployee){
//            if(commissionEmployee.getBankAccountNumber() <=0 ) {
//                System.out.println("Invalid Account");
//                return;
//            }
//        bank.transferMoney(companyAccountNumber,
//                commissionEmployee.getBankAccountNumber(), commissionEmployee.getEarnings());
//    }
//
//    // for hourly employee
//    public void depositEarningsIntoAccount( HourlyEmployee hourlyEmployee){
//        if(hourlyEmployee.getBankAccountNumber() <=0 ) {
//            System.out.println("Invalid Account");
//            return;
//        }
//        bank.transferMoney(companyAccountNumber,
//                hourlyEmployee.getBankAccountNumber(), hourlyEmployee.getEarnings());
//    }
//
//    // for peiceworker
//    public void depositEarningsIntoAccount( PieceWorker pieceWorker){
//        if(pieceWorker.getBankAccountNumber() <=0 ) {
//            System.out.println("Invalid Account");
//            return;
//        }
//        bank.transferMoney(companyAccountNumber,
//                pieceWorker.getBankAccountNumber(), pieceWorker.getEarnings());
//    }

