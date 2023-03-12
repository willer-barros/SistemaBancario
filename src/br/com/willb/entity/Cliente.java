package br.com.willb.entity;

public class Cliente {
	protected int saldoConta;
	public String nome;
	public int senhaCliente;

	public Cliente() {
	}

	public void validaSenha(int senhaCliente) {
		this.senhaCliente = senhaCliente;
		if (senhaCliente == 1234) {
			System.out.println("Senha correta");
		} else {
			System.out.println("senha Incorreta");
		}
	}

	public void consultarSaldo(int saldoConta) {
		this.saldoConta = saldoConta;
		System.out.println("Seu saldo e: R$" + saldoConta);
	}

	public void saque(int saque) {
		int resultado = saldoConta - saque;
		System.out.println("seu saldo atual e: R$" + resultado);
	}

}
