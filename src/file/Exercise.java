package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import file.entities.Product;

public class Exercise {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
		String uniqueTimestamp = formatter.format(now);
		ArrayList<Product> products = new ArrayList<Product>();

		String path = "/Users/caiquesantos/Documents/java_file_exercises/produtos.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line;

			while ((line = br.readLine()) != null) {
				String[] myArray = line.split(",");
				String name = myArray[0];
				double price = Double.parseDouble(myArray[1]);
				int quantity = Integer.parseInt(myArray[2]);

				Product product = new Product(name, price, quantity);
				products.add(product);
//				System.out.println(product.getTotalValue());

			}

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Leitura Finalizada! :) ");

		}

		String writePath = "/Users/caiquesantos/Documents/java_file_exercises/produtos_summary_created_file_at_"
				+ uniqueTimestamp + ".csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(writePath, true))) {
			for (Product product : products) {
				bw.write("Name: " + product.getName() + ", Total Value: " + product.getTotalValue());
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Resumo Finalizado! :) ");
		}

		sc.close();
	}

}
