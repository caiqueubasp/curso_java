package module_interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import module_interfaces.entities.Employee;

public class App2 {
	
	public static void main(String args[]) {
		
		
		List<Employee> list = new ArrayList<>();
		String path = "/Users/caiquesantos/Documents/employee.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String employeeCsv = br.readLine();

			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for(Employee emp : list) {
				System.out.println(emp.getName() + " " + emp.getSalary());
			}
		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Leitura Finalizada! :) ");

		}
	}

}
