package Turma_b;

import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 0;
		System.out.println("Digite '1' para Sim, '2' para Não");
		System.out.println(".................................");
		System.out.println("Telefonou para a vítima?");
		int telefonou = input.nextInt();
		if (telefonou == 1) contador++;
		System.out.println("Esteve no local do crime?");
		int local = input.nextInt();
		if (local == 1) contador++;
		System.out.println("Mora perto da vítima?");
		int mora = input.nextInt();
		if (mora == 1) contador++;
		System.out.println("Devia para a vítima?");
		int devia = input.nextInt();
		if (devia == 1) contador++;
		System.out.println("Já trabalhou com a vítima?");
		int trabalhou = input.nextInt();
		if (trabalhou == 1) contador++;
		
		// Gerando o resultado
		if (contador == 1 || contador == 2) {
			System.out.println("Suspeito");}
		else if (contador == 3 || contador == 4) {
			System.out.println("Cumplice"); }
		else {
			System.out.println("Assassino");
		}
	}
}
