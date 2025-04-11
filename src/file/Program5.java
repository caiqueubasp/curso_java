package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program5 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println("FOLDER PATH: " + folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println("FILE PATH: " + file);
			System.out.println("FILE NAME: " + file.getName());
			System.out.println("FILE PARENT: " + file.getParent());
		}
		
		Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
        String uniqueTimestamp = formatter.format(now);
		Boolean success = new File(strPath + "\\subdir_" + uniqueTimestamp).mkdir();
		System.out.println("DIR: " + success);
		
		

		sc.close();
	}

}
