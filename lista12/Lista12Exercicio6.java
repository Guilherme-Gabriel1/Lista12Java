package lista12;

import java.util.Scanner;

public class Lista12Exercicio6 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int soma = 0;
		        int quantidade = 0;
		        int numero;

		        System.out.println("Digite números inteiros positivos (digite um número negativo para parar):");

		        do {
		            System.out.print("Número: ");
		            numero = sc.nextInt();

		            if (numero >= 0) {
		                soma += numero;
		                quantidade++;
		            }

		        } while (numero >= 0);

		        if (quantidade > 0) {
		            double media = (double) soma / quantidade;
		            System.out.println("Média dos números: " + media);
		        }

		        sc.close();
	}

}
