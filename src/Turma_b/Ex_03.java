package Turma_b;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número");
		double dia = input.nextDouble();
		
		String resultado = dia==1?"domingo":dia==2?"Segunda":dia==3?"Terça":dia==4?"Quarta":dia==5?"Quinta":dia==6?"Sexta":dia==7?"Sabado":"valor inválido";
		System.out.println(resultado);
	}
}
