package mvc.model.vo;

public class Perguntas {

	private String pergunta;
	private int dificuldade;
	private int codigo;
	private boolean bt1;
	private boolean bt2;
	private boolean bt3;
	private boolean bt4;
	private String res1;
	private String res2;
	private String res3;
	private String res4;
	
	public Perguntas(String pergunta, int dificuldade, boolean bt1, boolean bt2, 
			boolean bt3, boolean bt4, String res1, String res2, String res3, String res4) {
		
		this.pergunta = pergunta;
		this.dificuldade = dificuldade;
		this.bt1 = bt1;
		this.bt2 = bt2;
		this.bt3 = bt3;
		this.bt4 = bt4;
		this.res1 = res1;
		this.res2 = res2;
		this.res3 = res3;
		this.res4 = res4;
		
	}
	

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getRes1() {
		return res1;
	}

	public void setRes1(String res1) {
		this.res1 = res1;
	}

	public String getRes2() {
		return res2;
	}

	public void setRes2(String res2) {
		this.res2 = res2;
	}

	public String getRes3() {
		return res3;
	}

	public void setRes3(String res3) {
		this.res3 = res3;
	}

	public String getRes4() {
		return res4;
	}

	public void setRes4(String res4) {
		this.res4 = res4;
	}

	public boolean getBt1() {
		return bt1;
	}
	public void setBt1(boolean bt1) {
		this.bt1 = bt1;
	}
	public boolean getBt2() {
		return bt2;
	}
	public void setBt2(boolean bt2) {
		this.bt2 = bt2;
	}
	public boolean getBt3() {
		return bt3;
	}
	public void setBt3(boolean bt3) {
		this.bt3 = bt3;
	}
	public boolean getBt4() {
		return bt4;
	}
	public void setBt4(boolean bt4) {
		this.bt4 = bt4;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public int getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	
}
