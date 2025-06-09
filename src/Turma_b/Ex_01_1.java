package Turma_b;

import java.util.Scanner;

public class Ex_01_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double resp = entrada.nextDouble();
		System.out.println(resp);
		
	String resultado = resp==0?"zero":resp>0?"Positivo":"Negativo";
		System.out.println(resultado);
	}
}
