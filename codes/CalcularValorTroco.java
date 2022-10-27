package codes;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o valor passado pelo cliente: R$");
        Double valorCliente = scanner.nextDouble();

        Double valorTroco = valorCliente - valorProduto;

        System.out.println("-----------------------------------");
        System.out.println("Valor do produto: R$" + valorProduto);
        System.out.println("Valor passado pelo cliente: R$" + valorCliente);
        System.out.println("Valor do troco: R$" + valorTroco);

        scanner.close();

    }
}
