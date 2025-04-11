package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program4 {

	public static void main(String args[]) {

		String[] lines = new String[] { "Good morning!", "Good afternoon!", "Good evening!" };

		Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
        String uniqueTimestamp = formatter.format(now);

		String path = "/Users/caiquesantos/Documents/created_file_at_" + uniqueTimestamp;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
