package lista12;

import java.util.Scanner;

public class Lista12Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;
        int n = Math.abs(numero);

        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }

        System.out.println("Soma dos dígitos: " + soma);

        sc.close();

	}

}
