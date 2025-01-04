package vetores;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;


public class Task9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?: ");
		int n = sc.nextInt();

		Student[] vect = new Student[n];
		ArrayList<Student> approvedStudents = new ArrayList<>();

		for (int i = 0; i < vect.length; i++) {
			int cI = i + 1;
			System.out.println("Digite nome, primeira e segunda nota do aluno: " + cI);
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();

			vect[i] = new Student(name, grade1, grade2);

			if (vect[i].checkAproved()) {
				approvedStudents.add(vect[i]);
			}

		}

		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < approvedStudents.size(); i++) {
			System.out.println(approvedStudents.get(i).getName());
		}

		sc.close();
	}

}
