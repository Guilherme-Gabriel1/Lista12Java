package lista12;

import java.util.Scanner;

public class Lista12Exercicio3 {

	public static void main(String[] args) {
		
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite quantos números triangulares você deseja ver: ");
		        int n = sc.nextInt();

		        System.out.println("\nPrimeiros " + n + " números triangulares:");

		        for (int i = 1; i <= n; i++) {
		            int triangular = i * (i + 1) / 2;
		            System.out.println("T(" + i + ") = " + triangular);
		        }

		        sc.close();

	}

}
