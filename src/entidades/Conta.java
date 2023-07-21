package entidades;

public class Conta {
	
	private int numero;
	private String nomeDoTitular;
	private double saldo;

	public Conta(int numero, String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
		this.numero = numero;
	}
	
	public Conta(int numero, String nomeDoTitular, double saldo) {
		this.nomeDoTitular = nomeDoTitular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getNumero() { return numero; }
	
	public String getNomeDoTitular() { return nomeDoTitular; }
	
	public void setNomeDoTitular(String nomeDoTitular) { this.nomeDoTitular = nomeDoTitular; }
	
	public double getSaldo() { return saldo; }
	
	public void deposito(double valorADepositar) { saldo += valorADepositar; }
	
	public double saque(double valorASacar) {
		saldo -= (valorASacar + 5.00);
		return valorASacar;
	}	
	
	public String toString() { return "\n----- Dados da conta -----\nNumero da conta: " +
			numero + "\nNome do titular: " +	nomeDoTitular + "\nSaldo em conta: R$ " +
			String.format("%.2f",saldo); }
}
