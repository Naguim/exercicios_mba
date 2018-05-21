package com.digital.bank;

public class ContaBancaria {
	protected double saldo;
	private double taxaDiaria = 1.00;
	private String cpf;
	
	public void saque(double valor) throws Exception {
		if ((saldo - valor) < 0)
			throw new Exception("Saldo Insuficiente");

		saldo -= valor;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getTaxaBancaria() {
		return taxaDiaria;
	}
	
	public double getTaxaBancaria(int dias) {
		return this.getTaxaBancaria() * dias;
	}
	
	public double getTaxaBancaria(int dias, int meses) {
		return this.getTaxaBancaria() * dias + this.getTaxaBancaria() * meses * 30;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		System.out.println(Double.toString(this.getSaldo()));
		return super.toString();
	}
}
