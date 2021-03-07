package br.edu.infnet.prjatm;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo");
		System.out.println("Por favor entre com o seu número de conta: ");
		Scanner scan = new Scanner(System.in);
		int numeroConta = scan.nextInt();
		System.out.println("O número da conta informado foi: " + numeroConta);
		
		
	}
}
