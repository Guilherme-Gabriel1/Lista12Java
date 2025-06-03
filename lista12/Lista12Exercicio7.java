package lista12;

import java.util.Scanner;

public class Lista12Exercicio7 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o início do intervalo: ");
		        int inicio = sc.nextInt();

		        System.out.print("Digite o fim do intervalo: ");
		        int fim = sc.nextInt();

		        System.out.println("\nNúmeros primos entre " + inicio + " e " + fim + ":");

		        for (int i = inicio; i <= fim; i++) {
		            if (ehPrimo(i)) {
		                System.out.print(i + " ");
		            }
		        }

		        sc.close();
		    }

		    public static boolean ehPrimo(int num) {
		        if (num <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		}
