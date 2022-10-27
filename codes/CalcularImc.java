package codes;

import java.util.Scanner;

public class CalcularImc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---CALCULADOR DE IMC---");

        System.out.println("Digite a altura: ");
        Double altura = scanner.nextDouble();

        System.out.println("Digite o peso: ");
        Double peso = scanner.nextDouble();

        Double valorImc = peso /(altura * altura);

        System.out.println("-----------------------------------");
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.printf("Valor do IMC: " + valorImc);

        scanner.close();
    }
}