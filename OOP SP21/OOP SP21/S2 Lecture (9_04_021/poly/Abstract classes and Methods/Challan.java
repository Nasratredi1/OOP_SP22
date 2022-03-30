package poly;

public class Challan {

	public void printChallan(Student student) {
		
		System.out.println("Printing Challan.");
		System.out.println(student.universityName);
		System.out.println(student.getName());
		System.out.println(student.getReg());
		//System.out.println(student.getNumberOfSemesters());
		System.out.println(student.calculateFee());
		
		if (student instanceof Undergraduate) {
			System.out.println(student.getNumberOfSemesters());
		}
	
	}
	
	/*public void printChallan(Postgraduate postgrad) {
		
		System.out.println("Printing Challan.");
		System.out.println(postgrad.universityName);
		System.out.println(postgrad.getName());
		System.out.println(postgrad.getReg());
		System.out.println(postgrad.getNumberOfSemesters());
		System.out.println(postgrad.calculateFee());
		
	}
	
	public void printChallan(Diploma diploma) {
		
		System.out.println("Printing Challan.");
		System.out.println(diploma.universityName);
		System.out.println(diploma.getName());
		System.out.println(diploma.getReg());
		System.out.println(diploma.getNumberOfSemesters());
		System.out.println(diploma.calculateFee());
		
	}*/
	
}
