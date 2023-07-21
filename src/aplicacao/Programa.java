package aplicacao;

import java.util.Scanner;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		Conta conta;
		String resposta = " ", nomeDoTitular;
		int numeroDaConta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular da conta");
		nomeDoTitular = sc.nextLine();
		System.out.println("Digite o numero da conta desejado");
		numeroDaConta = sc.nextInt();		
		while (resposta.charAt(0) != 'N' && resposta.charAt(0) != 'S'){
			System.out.print("Gostaria de realizar um deposito? Digite S ou N: ");
			resposta = sc.next().toUpperCase();
		}
		if (resposta.charAt(0) == 'S') {
			System.out.print("Digite o quanto deseja depositar: R$ ");
			conta = new Conta(numeroDaConta, nomeDoTitular, sc.nextDouble());
		} else { conta = new Conta(numeroDaConta, nomeDoTitular); }		
		System.out.print("Quantia a depositar: R$ ");
		conta.deposito(sc.nextDouble());
		System.out.println(conta);
		System.out.print("\nQuantia a sacar: R$ ");
		conta.saque(sc.nextDouble());
		System.out.println(conta);		
		sc.close();
	}
}
