package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaPerguntas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lbpergunta;

	private JButton btres1;
	private JButton btres2;
	private JButton btres3;
	private JButton btres4;
	private String pergunta;
	private String resposta1;
	private String resposta2;
	private String resposta3;
	private String resposta4;
	
	
	public void execultarTela() {
		this.setTitle("Perguntas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		this.lbpergunta = new JLabel(getPergunta()); //pergunta.getpergunta
		this.btres1 = new JButton(getResposta1()); //resposta1
		this.btres2 = new JButton(getResposta2()); //resposta2
		this.btres3 = new JButton(getResposta3()); //resposta3
		this.btres4 = new JButton(getResposta4()); //resposta4

		this.lbpergunta.setBounds(20, 20, 150, 20);
		this.btres1.setBounds(20, 85, 200, 25);
		this.btres2.setBounds(300, 85, 200, 25);
		this.btres3.setBounds(20, 135, 200, 25);
		this.btres4.setBounds(300, 135, 200, 25);
		

		
		this.add(lbpergunta);
		this.add(btres1);
		this.add(btres2);
		this.add(btres3);
		this.add(btres4);

	}
	
	

	public String getResposta1() {
		return resposta1;
	}

	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}

	public String getResposta2() {
		return resposta2;
	}

	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}

	public String getResposta3() {
		return resposta3;
	}

	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}

	public String getResposta4() {
		return resposta4;
	}

	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}

	
	public void setPergunta(String Pergunta) {
		this.pergunta = Pergunta;
		
	}

	public String getPergunta() {
		return pergunta;
	}
	
	public void acertou(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Você Acertou!!!", JOptionPane.WARNING_MESSAGE);
	}
	
	public void errou(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Você Errou", JOptionPane.WARNING_MESSAGE);
	}
	
	public JLabel getLbpergunta() {
		return lbpergunta;
	}

	public void setLbpergunta(JLabel lbpergunta) {
		this.lbpergunta = lbpergunta;
	}
	public JButton getBtres1() {
		return btres1;
	}
	public void setBtres1(JButton btres1) {
		this.btres1 = btres1;
	}
	public JButton getBtres2() {
		return btres2;
	}
	public void setBtres2(JButton btres2) {
		this.btres2 = btres2;
	}
	public JButton getBtres3() {
		return btres3;
	}
	public void setBtres3(JButton btres3) {
		this.btres3 = btres3;
	}
	public JButton getBtres4() {
		return btres4;
	}
	public void setBtres4(JButton btres4) {
		this.btres4 = btres4;
	}
	
	

}
