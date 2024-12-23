package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Task2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?: ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];
        double sum = 0.0;
        String teenList[] = new String[n];
        int countTeens = 0;

        for (int i = 0; i < vect.length; i++) {
            int cI = i + 1;
            System.out.println("Dados da " + cI + "a pessoa: ");
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);

            if (age <= 16) {
                teenList[countTeens] = name;
                countTeens++;
            }

            sum += vect[i].getHeight();
        }

        double avg = sum / n;
        double porcentagem = ((double) countTeens / n) * 100;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", avg);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", porcentagem);

        for (int i = 0; i < countTeens; i++) {
            System.out.println(teenList[i]);
        }

        sc.close();
    }
}
