package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.vo.Jogador;
import mvc.model.vo.ListaDuplamenteEncadeada;
import mvc.model.vo.ListaEstatica;
import mvc.view.TelaFinal;
import mvc.view.TelaPerguntas;

public class ControllerPerguntas implements ActionListener  {

	public TelaPerguntas tela2;
	static public int indicePergunta = 0;
	ListaEstatica lista = new ListaEstatica();
	ListaDuplamenteEncadeada jogadores = new ListaDuplamenteEncadeada();
	static private int tamanhoArray;
	static private int pontuacao = 0;
	
	public ControllerPerguntas(TelaPerguntas tela2, ListaEstatica listaPerguntas, String nomeJogador) {
		
		this.tela2 = tela2;
		lista = listaPerguntas;
		tela2.setPergunta(lista.get(indicePergunta).getPergunta());
		tela2.setResposta1(lista.get(indicePergunta).getRes1());
		tela2.setResposta2(lista.get(indicePergunta).getRes2());
		tela2.setResposta3(lista.get(indicePergunta).getRes3());
		tela2.setResposta4(lista.get(indicePergunta).getRes4());
		
		tamanhoArray = lista.getQuantidadeProdutos();
		tela2.execultarTela();
		
		Jogador j2 = new Jogador("Caio", 2);
		jogadores.add(j2);
		Jogador j3 = new Jogador("Filipe", 2);
		jogadores.add(j3);
		Jogador j4 = new Jogador("Jonatas", 4);
		jogadores.add(j4);
		Jogador j5 = new Jogador("José", 1);
		jogadores.add(j5);
		
		
		this.tela2.getBtres1().addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 if(listaPerguntas.get(indicePergunta).getBt1() == true) {
					 pontuacao++;
					 
				 	 mostraAcertou();
					 indicePergunta++;
					 tela2.setVisible(false);
					 	if(indicePergunta == tamanhoArray){ 
					 		
					 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
							jogadores.add(j1);
							 TelaFinal tela3 = new TelaFinal(jogadores); 
							 addColunaFinal(tela3);
							 tela3.setVisible(true);
						
					 	}else {
						  	TelaPerguntas tela2 = reabrirTela();
							tela2.setVisible(true);
							new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
					 	}
				
					 }else {
						 mostraErrou();
						 indicePergunta++;
						 tela2.setVisible(false);
						 
						 	if(indicePergunta == tamanhoArray){ 
						 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
								jogadores.add(j1);
								 TelaFinal tela3 = new TelaFinal(jogadores); 
								 addColunaFinal(tela3);
								 tela3.setVisible(true);
						 	}else {
						 		
							  	TelaPerguntas tela2 = reabrirTela();
								tela2.setVisible(true);
								new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
								
						 	}
					 }
			
				 
			 }});
		
		this.tela2.getBtres2().addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
					 if(listaPerguntas.get(indicePergunta).getBt2() == true) {
						 pontuacao++;
						 mostraAcertou();
						 indicePergunta++;
						 tela2.setVisible(false);
						 
						 	if(indicePergunta == tamanhoArray){ 
						 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
								jogadores.add(j1);
								 TelaFinal tela3 = new TelaFinal(jogadores); 
								 addColunaFinal(tela3);
								 tela3.setVisible(true);
						 	}else {
							  	TelaPerguntas tela2 = reabrirTela();
								tela2.setVisible(true);
								new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
						 	}
					
						 }else {
							 mostraErrou();
							 indicePergunta++;
							 tela2.setVisible(false);
							 
							 	if(indicePergunta == tamanhoArray){ 
							 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
									jogadores.add(j1);
									 TelaFinal tela3 = new TelaFinal(jogadores); 
									 addColunaFinal(tela3);
									 tela3.setVisible(true);
							 	}else {
							 		
								  	TelaPerguntas tela2 = reabrirTela();
									tela2.setVisible(true);
									new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
									
							 	}
						 }
				
					 
				 }});
		
		
		this.tela2.getBtres3().addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 if(listaPerguntas.get(indicePergunta).getBt3() == true) {
					 
					 pontuacao++;
					 mostraAcertou();
					 indicePergunta++;
					 tela2.setVisible(false);
					 	if(indicePergunta == tamanhoArray){ 
					 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
							jogadores.add(j1);
							 TelaFinal tela3 = new TelaFinal(jogadores); 
							 addColunaFinal(tela3);
							 tela3.setVisible(true);
					 	}else {
						  	TelaPerguntas tela2 = reabrirTela();
							tela2.setVisible(true);
							new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
					 	}
				
					 }else {
						 mostraErrou();
						 indicePergunta++;
						 tela2.setVisible(false);
						 
						 	if(indicePergunta == tamanhoArray){ 
						 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
								jogadores.add(j1);
								 TelaFinal tela3 = new TelaFinal(jogadores); 
								 addColunaFinal(tela3);
								 tela3.setVisible(true);
						 	}else {
						 		
							  	TelaPerguntas tela2 = reabrirTela();
								tela2.setVisible(true);
								new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
								
						 	}
					 }
			
				 
			 }});
		
		this.tela2.getBtres4().addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
			
				 if(listaPerguntas.get(indicePergunta).getBt4() == true) {

					 pontuacao++;
					 mostraAcertou();
					 indicePergunta++;
					 tela2.setVisible(false);
					 	if(indicePergunta == tamanhoArray){ 
					 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
							jogadores.add(j1);
							 TelaFinal tela3 = new TelaFinal(jogadores); 
							 addColunaFinal(tela3);
							 tela3.setVisible(true);
					 	}else {
						  	TelaPerguntas tela2 = reabrirTela();
							tela2.setVisible(true);
							new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
					 	}
				
					 }else {
						 mostraErrou();
						 indicePergunta++;
						 tela2.setVisible(false);
						 
						 	if(indicePergunta == tamanhoArray){
						 		
						 		Jogador j1 = new Jogador(nomeJogador, pontuacao);
								jogadores.add(j1);
								 TelaFinal tela3 = new TelaFinal(jogadores); 
								 addColunaFinal(tela3);
								 tela3.setVisible(true);
								 
						 	}else {
						 		
							  	TelaPerguntas tela2 = reabrirTela();
								tela2.setVisible(true);
								new ControllerPerguntas(tela2, listaPerguntas, nomeJogador);
								
						 	}
					 }
			
				 
			 }});
	}
	
	public void addColunaFinal(TelaFinal tela3) {
		for(int i = 0; i <= jogadores.size()-1; i++) {
			tela3.adicionarJogadorTabela(jogadores.get(i));
		}
	}
	
	public void mostraAcertou() {
		this.tela2.acertou("Resposta correta!!");
	}
	
	public void mostraErrou() {
		this.tela2.errou("Resposta errada!!");
	}
	
	public void mostraPergunta() {
		this.tela2.setPergunta(lista.get(indicePergunta).getPergunta());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public TelaPerguntas reabrirTela() {
		return new TelaPerguntas();
	}

	
	
	
}
