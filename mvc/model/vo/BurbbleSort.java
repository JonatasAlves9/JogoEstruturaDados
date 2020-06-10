package mvc.model.vo;

public class BurbbleSort {
	
	public void ordenar(ListaDuplamenteEncadeada v) {
		int i = 0, aux = 0, continua = 0, fim = v.size() - 1;
		do {
			for(i = 0; i < fim; i++) {
				if( v.get(i+1).getPontuacaoAtingida() > v.get(i).getPontuacaoAtingida()) {
					aux = v.get(i).getPontuacaoAtingida();
					v.get(i).setPontuacaoAtingida(v.get(i+1).getPontuacaoAtingida());  
					v.get(i).setNome(v.get(i+1).getNome());
					v.get(i+1).setPontuacaoAtingida(aux);
					v.get(i+1).setNome(v.get(i).getNome());
				}
				continua = i;
			}
			fim--;
		}while(continua!= 0);
	}
	
}

