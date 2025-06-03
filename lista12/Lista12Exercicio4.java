package lista12;

import java.util.Scanner;

public class Lista12Exercicio4 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int pares = 0;
		        int impares = 0;

		        System.out.print("Quantos números você quer digitar? ");
		        int total = sc.nextInt();

		        for (int i = 1; i <= total; i++) {
		            System.out.print("Digite o " + i + "º número: ");
		            int num = sc.nextInt();

		            if (num % 2 == 0) {
		                pares++;
		            } else {
		                impares++;
		            }
		        }

		        System.out.println("Quantidade de números pares: " + pares);
		        System.out.println("Quantidade de números ímpares: " + impares);
 

		sc.close();

	}

}
