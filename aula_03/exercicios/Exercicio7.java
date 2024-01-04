package exercicios;
/*
 * Peça ao usuário para inserir o preço de um produto e a porcentagem de desconto. Calcule o preço final com o desconto aplicado.
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o preço: ");
        double preco = entrada.nextDouble();

        System.out.println("Digite o desconto(%):");
        double desconto = entrada.nextDouble();

        // PROCESSAMENTO
        double valorADescontar = preco * (desconto / 100.0);

        double precoFinal = preco - valorADescontar;

        System.out.printf("O preço original foi %.1f. O preço final é %.2f com %.1f de desconto \n", preco, precoFinal, desconto);
        // %f = double, float
        // %d = int
        // %s = strings
    }
}
