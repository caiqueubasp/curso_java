package exercises.exercises_interface.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private int number;
	private LocalDateTime date;
	private double value;
	private int instalmentsValue;
	private List<Instalments> instalments = new ArrayList<>();
	private ServicePayment service;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


	public Contract() {

	}

	public Contract(int number, LocalDateTime date, double value, int instalmentsValue, ServicePayment service) {
		this.number = number;
		this.date = date;
		this.value = value;
		this.instalmentsValue = instalmentsValue;
		this.service = service;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public List<Instalments> getInstalments() {
		return instalments;
	}

	public void setInstalments(List<Instalments> instalments) {
		this.instalments = instalments;
	}
	
	public void setInstalmentsPerOne(Instalments newInstalment) {
		this.instalments.add(newInstalment);
	}

	public ServicePayment getService() {
		return service;
	}

	public void setService(ServicePayment service) {
		this.service = service;
	}
	

	public int getInstalmentsValue() {
		return instalmentsValue;
	}

	public void setInstalmentsValue(int instalmentsValue) {
		this.instalmentsValue = instalmentsValue;
	}
	
	public void processContract() {
		for(int i = 0; i <= instalmentsValue; i++) {
			LocalDateTime nextDate = date.plusMonths(i);
			Instalments instalment = new Instalments(nextDate, getService().calcPayment(value, instalmentsValue));
			setInstalmentsPerOne(instalment);
		}
	}
	
	public void showInstalments() {
		for(Instalments item: instalments) {
			System.out.println("Date: " + item.getDate().format(fmt) + " " + "Value: " + item.getValue());
		}
	}
	
	public Instalments getEspecificInstalment(int val) {
		return instalments.get(val);
	}

	public String toString() {
		return "Contract details: " + "Contract number: " + getNumber() + " " + "Contract date: " + getDate() + " "
				+ "Contract value: " + getValue() + " " + "Parcelas: "
				+ getService().calcPayment(value, instalmentsValue);
	}

}
