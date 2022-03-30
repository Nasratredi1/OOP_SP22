package LabAssignment_2;

public class TestClass {
    public static void main(String[] args) {
     Employee emp0 =new Employee("Rizwan","Ahmad","11222344");
    CommisionEmployeee commsionemp1 = new CommisionEmployeee("Nasrat","Redi","444-44-4444",50,6000);
    BasePlusCommisionEmployee basepluscommemp2 = new BasePlusCommisionEmployee("John","Smith","333-33-3333",10000, .06 ,50000);
    HourlyEmployee hourlemp3 = new HourlyEmployee("Ahmad", "Ali", "222-22-2222", 16.75, 40 );
    SalariedEmployee salaryemp4 = new SalariedEmployee("Babar","Azam","111-11-1111", 800.00 );


        System.out.println(commsionemp1.toString());
        System.out.println(commsionemp1.earning());
        System.out.println(basepluscommemp2.toString());
        System.out.println(hourlemp3.earnings());
        System.out.println(hourlemp3.toString());
        System.out.println(salaryemp4.toString());
        System.out.println(salaryemp4.earnings());
        System.out.println(emp0.toString());







        //System.out.println(commsionemp.getcommissionRate());






    }
}
