package poly;

//abstract keyword
//we cannot create object of abstract class
//implementation details in full are not present
//Generalization

public abstract class Student {

	String name;
	String reg;
	
	final static int admissionFee;
	final static int normalSemesterFee;
	final static String universityName;
	
	static {
		admissionFee = 10000;
		normalSemesterFee = 80000;
		universityName = "COMSATS University Islamabad, Lahore Campus";
	}
	
	public Student(String name, String reg) {
		super();
		this.name = name;
		this.reg = reg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}

	public int calculateFee() {
		
		return admissionFee + normalSemesterFee;
	}
	
	//no body, only definition
	public abstract int getNumberOfSemesters();

	
}
