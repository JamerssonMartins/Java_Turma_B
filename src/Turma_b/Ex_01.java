package Turma_b;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double resp = entrada.nextDouble();
		System.out.println(resp);
		
		if (resp==0) {
			System.out.println("Zero");}
		else if (resp>0) {
			System.out.println("O número é positivo");}
		else {
			System.out.println("O número é negativo");
		}
		}
	}

