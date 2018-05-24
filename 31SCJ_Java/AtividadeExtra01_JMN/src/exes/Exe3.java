package exes;

import java.util.ArrayList;

public class Exe3 {
	
	public double media(ArrayList<Double> valores) {
		double soma = 0;
		
		for (int i=0; i < valores.size(); i++) {
			soma += valores.get(i);
		}
		
		return soma/valores.size();
	}
}
