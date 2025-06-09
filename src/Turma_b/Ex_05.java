package Turma_b;

import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		char letra = input.next().charAt(0);
		System.out.println(letra);
		
		// Converte a letra
		letra = Character.toUpperCase(letra);
		
		if(letra=='M') {
			System.out.println("Masculino");
		}else if (letra=='F') {
			System.out.println("Feminino");
		}else {
			System.out.println("Inválido");
		}
	}
}
