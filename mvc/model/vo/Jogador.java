package mvc.model.vo;

import java.util.Collections;

public class Jogador  {

	private String nome;
	private int pontuacaoAtingida = 0;
	
	public Jogador(String nome, int pont) {
		this.nome = nome;
		this.pontuacaoAtingida = pont;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontuacaoAtingida() {
		return pontuacaoAtingida;
	}
	public void setPontuacaoAtingida(int pontuacaoAtingida) {
		this.pontuacaoAtingida = pontuacaoAtingida;
	}
	
	@Override
	public String toString() {
		return "Jogador [Nome=" + nome + ", Pontuação=" + pontuacaoAtingida + "]";
	}

	}

