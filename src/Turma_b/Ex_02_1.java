package Turma_b;

import java.util.Scanner;

public class Ex_02_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite n1: ");
		int n1 = input.nextInt();
		System.out.println("Digite n2: ");
		int n2 = input.nextInt();
		System.out.println("Digite n3: ");
		int n3 = input.nextInt();
		int maior = Math.max(n1, Math.max(n2, n3));
		System.out.println(maior);
	}
}
