package mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mvc.model.vo.Jogador;
import mvc.model.vo.ListaDuplamenteEncadeada;

public class TelaFinal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lbBemVindo;
	private JButton btIniciar;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	
	
	public TelaFinal(ListaDuplamenteEncadeada l1) {
		this.setTitle("Sua pontuação");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 700);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		this.lbBemVindo = new JLabel("Olá, "+l1.get(l1.size()-1).getNome() + ". Sua pontuação foi de: " + 
		l1.get(l1.size()-1).getPontuacaoAtingida());
		
		this.btIniciar = new JButton("Sair");

		this.lbBemVindo.setBounds(20, 20, 500, 20);
		this.btIniciar.setBounds(20, 600, 200, 25);
		
		criarTabela();
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(20, 125, 580, 420);
		
		this.add(lbBemVindo);
		this.add(btIniciar);
		this.add(barraRolagem);

	}

	private void criarTabela() {
		tabela = new JTable(modelo);
		modelo.addColumn("Nome");
		modelo.addColumn("Pontuação");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(380);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
	}
	
	public void adicionarJogadorTabela(Jogador Jogador) {
		modelo.addRow(new Object[] { Jogador.getNome(), Jogador.getPontuacaoAtingida() });
	}
	
	public JLabel getLbBemVindo() {
		return lbBemVindo;
	}

	public void setLbBemVindo(JLabel lbBemVindo) {
		this.lbBemVindo = lbBemVindo;
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
