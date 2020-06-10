package mvc.view;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mvc.model.vo.Jogador;

public class TelaInicial extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel lbBemVindo;
	private JTextField tfNome;
	private JButton btIniciar;
	private Jogador jogadorAtual;
	
	
	
	
	
	public TelaInicial() {
		this.setTitle("Bem Vindo");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		this.lbBemVindo = new JLabel("Bem vindo ao jogo!");
		this.tfNome = new JTextField("Digite seu nome");
		
		this.btIniciar = new JButton("Iniciar");

		this.lbBemVindo.setBounds(20, 20, 150, 20);
		this.tfNome.setBounds(20, 50, 350, 25);
		this.btIniciar.setBounds(20, 85, 200, 25);

		
		this.add(lbBemVindo);
		this.add(tfNome);
		this.add(btIniciar);

	}

	public JLabel getLbBemVindo() {
		return lbBemVindo;
	}

	public void setLbBemVindo(JLabel lbBemVindo) {
		this.lbBemVindo = lbBemVindo;
	}

	public JTextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(JTextField tfNome) {
		this.tfNome = tfNome;
	}

	public JButton getBtIniciar() {
		return btIniciar;
	}

	public void setBtIniciar(JButton btIniciar) {
		this.btIniciar = btIniciar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
