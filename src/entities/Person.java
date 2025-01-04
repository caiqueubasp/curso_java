package entities;

public class Person {

	private String name;
	private int ag;
	private double height;
	private String gender;

	public Person(String name, int ag, double height) {
		this.name = name;
		this.ag = ag;
		this.height = height;
	}

	public Person(String name, int ag) {
		this.name = name;
		this.ag = ag;
	}

	public Person(String name, double height, String gender) {
		this.name = name;
		this.height = height;
		this.gender = gender;
	}

	public Person(double height, String gender) {
		this.height = height;
		this.gender = gender;
	}

	public Person() {

	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAg() {
		return ag;
	}

	public void setAg(int ag) {
		this.ag = ag;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ag=" + ag + ", height=" + height + ", gender=" + gender + "]";
	}
	
	

}
