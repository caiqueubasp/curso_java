package exercises.exercises_interface.entities;

import java.time.LocalDateTime;

public class Instalments {

	private LocalDateTime date;
	private Double value;

	public Instalments() {

	}

	public Instalments(LocalDateTime date, Double value) {
		this.date = date;
		this.value = value;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
