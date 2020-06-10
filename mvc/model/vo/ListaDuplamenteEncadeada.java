package mvc.model.vo;

public class ListaDuplamenteEncadeada {
private No primeiro = null;
	
	public int size() {
		int tamanho = 0;
		No aux = primeiro;
		while(aux != null) {
			tamanho++;
			aux = aux.proximo;
		}
		return tamanho;
	}
	
	public boolean isVazia() {
		return size() == 0;
	}
	
	public void add(Jogador j) {
		No no = new No();
		no.elemento = j;
		no.anterior = null;
		no.proximo = null;
		if(isVazia()) {
			primeiro = no;
		}else {
			No aux = primeiro;
			while(aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = no;
			no.anterior = aux;
		}
	}
	
	public boolean remover(Jogador jogador) {
		if(isVazia()) {
			return false;
		}
		No aux = primeiro;
		while(aux != null && aux.elemento != jogador) {
			aux = aux.proximo;
		}
		if(aux == null) {
			return false;
		}
		if(aux.anterior == null) {
			primeiro = aux.proximo;
		}else {
			aux.anterior.proximo = aux.proximo;
		}
		if(aux.proximo != null) {
			aux.proximo.anterior = aux.anterior;
		}
		return true;
	}
	
	public Jogador get(int posicao) {
		if(posicao < 0 || posicao >= size()) {
			return null;
		}
		int i = 0;
		No aux = primeiro;
		while(aux != null && i < posicao) {
			aux = aux.proximo;
			i++;
		}
		if(aux == null) {
			return null;
		}
		return aux.elemento;
	}
	
	public void setJ(Jogador l) {
		this.add(l);
	}
	
	private class No {
		Jogador elemento;
		No anterior;
		No proximo;
	}

}