package Turma_b;

import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite as notas: ");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double media = (double) ((nota1 + nota2)/2);
		System.out.println(media);
	}
}

