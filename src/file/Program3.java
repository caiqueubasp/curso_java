package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String args[]) {

		String path = "/Users/caiquesantos/Documents/sample_file.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Leitura Finalizada! :) ");

		}

	}

}
