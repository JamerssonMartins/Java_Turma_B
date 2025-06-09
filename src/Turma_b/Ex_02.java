package Turma_b;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double resp1 = entrada.nextDouble();
		double resp2 = entrada.nextDouble();
		double resp3 = entrada.nextDouble();
		// System.out.println(resp1);
		// System.out.println(resp2);
		// System.out.println(resp3);

		if(resp1>resp2 && resp1>resp3) {
			System.out.println(resp1);}
		else if (resp2>resp3) {
			System.out.println(resp2);}
		else {
			System.out.println(resp3);}
		}
		}

