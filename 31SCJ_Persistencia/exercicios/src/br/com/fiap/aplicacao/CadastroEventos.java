package br.com.fiap.aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.fiap.dao.EventosDao;
import br.com.fiap.entity.Evento;
import br.com.fiap.repository.Repositorio;

public class CadastroEventos {
	public static void main(String[] args) {
		Repositorio repo = new Repositorio();
		try {
			
			UIManager.setLookAndFeel(UIManager
					.getSystemLookAndFeelClassName());
			
			while(true) {
				int opcao = JOptionPane.showConfirmDialog(
						null, 
						"Deseja incluir um evento?", 
						"Confirmação", 
						JOptionPane.YES_NO_OPTION);
				
				if(opcao == JOptionPane.NO_OPTION) {
					break;
				}
				
				String descricao = JOptionPane
						.showInputDialog("Descrição do evento:");
				
				String data = JOptionPane
						.showInputDialog("Data do evento (dd/MM/aaaa):");
				
				Date dataEvento = new 
						SimpleDateFormat("dd/MM/yyyy").parse(data);
				
				String responsavel = JOptionPane
						.showInputDialog("Responsavel do evento:");
				
				//Instanciando a classe Evento
				Evento evento = new Evento();
				evento.setDescricao(descricao);
				evento.setData(dataEvento);
				evento.setResponsavel(responsavel);
				
				EventosDao dao = repo.getEventosDao();
				dao.incluir(evento);
				
				JOptionPane.showMessageDialog(
						null, 
						"Evento incluído com sucesso",
						"Mensagem",
						JOptionPane.INFORMATION_MESSAGE);
				
				
				
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(
					null, 
					"ERRO: " + e.getMessage(),
					"Erro",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
