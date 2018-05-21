import com.digital.bank.*;

public class Main {

	public static void main(String[] args) {
		
		//exe1
		Cliente cliente = new Cliente("bobo", "bobo1", "bobo2", "bobo3");
		
		//exe2
		Math math = new Math();		
		System.out.println(math.convertDecToBin(12));
		
		//exe3
		int sequencia[] = {3,5,1,9};
		ArrayFunc array = new ArrayFunc(sequencia);
		array.toString();
		
		//exe4
		ContaPoupanca conta = new ContaPoupanca();
		conta.deposito(50);
		try {
			conta.saque(100);
			System.out.println("OI");
		} catch (Exception e) {
			System.out.println("NAO DEU");
		}
		conta.deposito(100);
		System.out.println(conta.getTaxaBancaria());
		System.out.println(conta.getTaxaBancaria(20));
		System.out.println(conta.getTaxaBancaria(1,1));
		
		if (Classificacao.BAIXO.isCompatible(conta))
			System.out.println("DEU CERTO 1");
		
		conta.setCpf("33162696810");
		
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.setCpf("33162696811");
		if (conta2.equals(conta))
			System.out.println("DEU CERTO 2");
		
		
	} 
	
}
