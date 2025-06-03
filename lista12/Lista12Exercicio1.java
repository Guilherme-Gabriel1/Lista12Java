package lista12;

import java.util.Scanner;

public class Lista12Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		
		System.out.println("nome invertido: ");
		for(int letras = palavra.length() - 1; letras >= 0; letras--) {
			System.out.println(palavra.charAt(letras));
		}
		
		sc.close();

	}

}
