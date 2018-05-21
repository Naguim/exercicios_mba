package com.digital.bank;

public enum Classificacao {
    POTENCIAL(400000, 500000),
    MEDIO(200000, 4000000),
    BAIXO(0, 200000);
	
	private double min;
	private double max;
	
	Classificacao(double min, double max) {
		this.min= min;
		this.max= max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}
	
	public boolean isCompatible(ContaBancaria Conta) {
		if ((Conta.getSaldo() >= this.getMin()) && (Conta.getSaldo() <= this.getMax())) {
			return true;
		} else {
			return false;
		}
	}
}
