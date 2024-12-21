package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public String studentStatus;
	
	public void hasStudantPassed() {
		double sum = (this.grade1 + this.grade2 + this.grade3);
		boolean passed = sum >= 60 ? true : false;
		this.studentStatus = passed == true ? "PASS" : "FAILED";
	}
	
	public String toString() {
		return name +  
				", Grade 1: " + grade1 + 
				", Grade 2: " + grade2 + 
				", Grade 3: " + grade3 + 
				", Student Status: " + studentStatus;
				
	}
	

}
