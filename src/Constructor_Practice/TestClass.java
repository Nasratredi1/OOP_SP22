package Constructor_Practice;

public class TestClass {
    public static void main(String[] args) {
        Account johnAccount = new Account("1234", 0.00, "John smith", "john@gmail.com", "0345 43 54 54");

//        johnAccount.setNumber("1234");
//        johnAccount.setBalance(0.00);
//        johnAccount.setCustomerName("John redi");
//        johnAccount.setCustomerEmailAddress("John@gmail.com");
//        johnAccount.setCustomerPhoneNumber("03 454 345 544");

        System.out.println("current balance is "+johnAccount.getBalance());
        johnAccount.withdrawal(100.0);
        johnAccount.deposit(50.0);
        johnAccount.withdrawal(40.0);

    }

}
