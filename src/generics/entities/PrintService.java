package generics.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public void print() {
		for (T value : list) {
			System.out.println(value);
		}
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

}