package br.com.willb.main;

import br.com.willb.entity.Cliente;

public class Caixa {
	
	public static Cliente cliente;

	public static void main(String[] args) {
		System.out.println(" ---- Bem-vindo ao banco Will Bank -----");
		
		Cliente cliente = new Cliente();
		cliente.nome = "willer".concat(" Barros");
		System.out.println("Seu nome e: " + cliente.nome);
		cliente.validaSenha(1234);
		
		cliente.consultarSaldo(1000);
		cliente.saque(700);
		
		
		
	}
	
}
