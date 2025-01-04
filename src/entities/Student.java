package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public boolean isAproved;
	public String studentStatus;
	
	
	
	public Student(String name, double grade1, double grade2, double grade3, String studentStatus) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.studentStatus = studentStatus;
	}
	
	public Student(String name, double grade1, double grade2) {
		super();
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getGrade3() {
		return grade3;
	}

	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	
	

	public String getStudentStatus() {
		return studentStatus;
	}

	public boolean isAproved() {
		return isAproved;
	}

	public void setAproved(boolean isAproved) {
		this.isAproved = isAproved;
	}
	
	public boolean checkAproved() {
		double average = (this.grade1 + this.grade2) / 2;
		boolean result = average >= 6 ? true : false;
		this.setAproved(result);
		return result;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

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
