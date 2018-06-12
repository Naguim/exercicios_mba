package exe4;

import javax.swing.JOptionPane;

public class CalculadoraApp {

	public static void main(String[] args) {
		int opcao = JOptionPane.YES_OPTION;
		Calculadora calc = new Calculadora();
		
		while(opcao == JOptionPane.YES_OPTION) {
			String num1 = JOptionPane
					.showInputDialog("Número 1:");
			
			if (num1 == null)
				break; //sai do programa se clicou em cancelar
			
			String num2 = JOptionPane
					.showInputDialog("Número 2:");			
			
			if (num2 == null)
				break; //sai do programa se clicou em cancelar
			
			try {
				float float1 = Float.parseFloat(num1);
				float float2 = Float.parseFloat(num2);
				
				Object[] options = {"Somar","Subtrair", "Dividir", "Multiplicar"};
				int n = JOptionPane.showOptionDialog(null,
				            "Escolha a operação",
				            "Calculadora",
				            JOptionPane.YES_NO_CANCEL_OPTION,
				            JOptionPane.DEFAULT_OPTION,
				            null,
				            options,
				            options[1]);
				
				switch (n) {
					case 0:
						System.out.println("Resultado da soma : " + String.valueOf(calc.somar(float1, float2)));
						break;
					case 1:
						System.out.println("Resultado da subtração : " + String.valueOf(calc.subtrair(float1, float2)));
						break;
					case 2:
						System.out.println("Resultado da divisão : " + String.valueOf(calc.dividir(float1, float2)));
						break;
					case 3:
						System.out.println("Resultado da multiplicação : " + String.valueOf(calc.multiplicar(float1, float2)));
						break;	
					default:
						throw new Exception("Operação Inválida");
				}				
				
				opcao = JOptionPane.showConfirmDialog(
							null, 
							"Deseja fazer outra operação?", 
							"Confirmação", 
							JOptionPane.YES_NO_OPTION);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(
					null, 
					"ERRO: " + e.getMessage(),
					"Erro, tente novamente",
					JOptionPane.ERROR_MESSAGE);
				continue;
			}
			
		}
	}

}
