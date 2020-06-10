package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.model.vo.ListaEstatica;
import mvc.model.vo.Perguntas;
import mvc.view.TelaInicial;
import mvc.view.TelaPerguntas;

public class ControllerInicial implements ActionListener  {
	
	private TelaInicial telaInicial;
	ListaEstatica listaperguntas = new ListaEstatica();
	
	public ControllerInicial(TelaInicial tela1) {
		this.telaInicial = tela1;
		this.telaInicial.getBtIniciar().addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Perguntas p1 = new Perguntas("Quem descobriu o Brasil?", 1, false, true, false, false, "Colombo", 
				"Pedro Alvares Cabral", "Machado de Assis", "Teodoro da fonseca");
		
		Perguntas p2 = new Perguntas("Qual a integral de x²?", 5, false, false, false, true, "1", 
				"2x", "3", "2");
		Perguntas p3 = new Perguntas("Quais o menor e o maior país do mundo? ", 5, true, false, false, false, "Vaticano e Rússia", 
				"Nauru e China", "Mônaco e Canadá", " Malta e Estados Unidos");
				
		Perguntas p4 = new Perguntas("Quantas casas decimais tem o número pi??", 5, false, false, true, false, " Duas", 
				"Centenas", "Infinitas", "Vinte");
		
		Perguntas p5 = new Perguntas("Qual será nossa nota?", 5, false, false, true, false, "0", 
				"0", "10", "0");
		
	
		listaperguntas.add(p1);
		listaperguntas.add(p2);
		listaperguntas.add(p3);
		listaperguntas.add(p4);
		listaperguntas.add(p5);
		
		telaInicial.setVisible(false);
		TelaPerguntas tela2 = new TelaPerguntas();
		new ControllerPerguntas(tela2, listaperguntas, this.telaInicial.getTfNome().getText());
		tela2.setVisible(true);
		
	
		
	}

}
