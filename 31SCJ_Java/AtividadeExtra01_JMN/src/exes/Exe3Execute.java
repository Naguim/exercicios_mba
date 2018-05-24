package exes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exe3Execute {

	public static void main(String[] args) {
		int opcao = 0;
		ArrayList<Double> salarios = new ArrayList<Double>();
		
		while (opcao != JOptionPane.NO_OPTION) {
			opcao = JOptionPane.showConfirmDialog(
					null, 
					"Deseja informar o salario de um novo funcionario?", 
					"Confirmação", 
					JOptionPane.YES_NO_OPTION);
			
			if (opcao == JOptionPane.YES_OPTION) {
				try {
					Double salario = Double.parseDouble(JOptionPane
							.showInputDialog("Informe o salário do funcionario:"));
					salarios.add(salario);		
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro com o valor informado, verifique!");
					salarios.clear();
					break;					
				}						
			}
		}
				
		if (salarios.size() > 0) {
			Exe3 exe = new Exe3();
			
			JOptionPane.showMessageDialog(null, "Média dos Salários: " + exe.media(salarios));
		}

	}

}
