package com.digital.bank;

public class ContaPoupanca extends ContaBancaria {
	private static final double taxa = 0.10;
	
	
	public void saque(double valor) throws Exception {
		if ((saldo - (this.taxaOperacao(valor) + valor)) < 0)
			throw new Exception("Saldo Insuficiente");
		
		saldo -= this.taxaOperacao(valor);
		super.saque(valor);
		this.toString();
	}
	
	public void deposito(double valor) {
		super.deposito(valor);
		saldo -= this.taxaOperacao(valor);
		this.toString();
	}
	
	private double taxaOperacao(double valor) {
		return valor * taxa;
	}
	
	@Override
	public boolean equals(Object arg0) {
		ContaPoupanca conta = (ContaPoupanca) arg0;
		
		return conta.getCpf().equals(this.getCpf());
	}
}
