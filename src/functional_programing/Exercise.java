package functional_programing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Funcionario {
    private String nome;
    private double salario;
    private String email;

    public Funcionario(String nome, double salario, String email) {
        this.nome = nome;
        this.salario = salario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getEmail() {
        return email;
    }
}

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ana", 3000.0, "ana@email.com"));
        funcionarios.add(new Funcionario("Bruno", 2500.0, "bruno@email.com"));
        funcionarios.add(new Funcionario("Carlos", 4000.0, "carlos@email.com"));
        funcionarios.add(new Funcionario("Amanda", 3500.0, "amanda@email.com"));
        funcionarios.add(new Funcionario("Beatriz", 2000.0, "beatriz@email.com"));

        // Entrada do usuário para o salário limite
        System.out.print("Digite o valor do salário limite: ");
        double salarioLimite = scanner.nextDouble();

        // Filtrar e ordenar os emails dos funcionários com salário superior ao limite
        List<String> emailsOrdenados = funcionarios.stream()
                .filter(f -> f.getSalario() > salarioLimite)
                .map(Funcionario::getEmail)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nEmails dos funcionários com salário superior a " + salarioLimite + ":");
        emailsOrdenados.forEach(System.out::println);

        // Entrada do usuário para a letra inicial
        System.out.print("\nDigite a letra inicial para somar os salários: ");
        char letraInicial = scanner.next().toUpperCase().charAt(0);

        // Somar os salários dos funcionários cujo nome começa com a letra fornecida
        double somaSalarios = funcionarios.stream()
                .filter(f -> f.getNome().toUpperCase().charAt(0) == letraInicial)
                .mapToDouble(Funcionario::getSalario)
                .sum();

        System.out.println("Soma dos salários dos funcionários cujo nome começa com '" + letraInicial + "': " + somaSalarios);

        scanner.close();
    }
}