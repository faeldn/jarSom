package com.github.faeldn.jarSom;

public class Somador {

	public static void main(String[] args) {
		int soma = 0;
		for(int i = 0; i < args.length; i++) {
			if(args != null) {
				soma += Integer.parseInt(args[i]);
			}
		}
			System.out.println("O resultado da soma dos argumentos é: " + soma);
	}

}
