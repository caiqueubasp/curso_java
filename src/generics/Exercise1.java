package generics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import generics.entities.LogEntry;

public class Exercise1 {

	public static void main(String[] args) {

		String path = "/Users/caiquesantos/Documents/tech_exercise_files/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(username, moment));

				line = br.readLine();

			}

			System.out.println("Total users: " + set.size());

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println();
			System.out.println("Leitura Finalizada! :) ");

		}

	}
}
