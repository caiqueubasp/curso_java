package entities;

public class Person {

	private String name;
	private int ag;
	private double height;

	public Person(String name, int ag, double height) {
		this.name = name;
		this.ag = ag;
		this.height = height;
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

}
