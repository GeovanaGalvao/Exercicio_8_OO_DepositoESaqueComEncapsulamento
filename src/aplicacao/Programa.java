package aplicacao;

import java.util.Scanner;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Conta conta;
		String resposta = " ", nomeDoTitular;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero da conta desejado: ");
		int numeroDaConta = sc.nextInt();
		sc.nextLine(); // Corrige o bug do Scanner.NextSomething no java.
		System.out.print("Digite o nome do titular da conta: ");
		nomeDoTitular = sc.nextLine();
		while (resposta.charAt(0) != 'N' && resposta.charAt(0) != 'S'){
			System.out.print("Gostaria de realizar um deposito? Digite S ou N: ");
			resposta = sc.next().toUpperCase();
		}
		if (resposta.charAt(0) == 'S') {
			System.out.print("Digite o quanto deseja depositar: R$ ");
			conta = new Conta(numeroDaConta, nomeDoTitular, sc.nextDouble());
		} else { conta = new Conta(numeroDaConta, nomeDoTitular); }	
		System.out.println(conta);
		System.out.print("\nQuantia a depositar: R$ ");
		conta.deposito(sc.nextDouble());
		System.out.println(conta);
		System.out.print("\nQuantia a sacar: R$ ");
		conta.saque(sc.nextDouble());
		System.out.println(conta);		
		sc.close();
	}
}
