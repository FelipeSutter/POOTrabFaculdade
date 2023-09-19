package br.com.poo.cadastro.pessoas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField edNome;
	private JTextField edTelefone;
	private JTextField edEmail;
	private JTextField edBairro;
	private JTextField edComplemento;
	private JTextField edNumero;
	private JTextField edLogradouro;
	private JTextField edCep;
	private JTextField edCidade;
	private OperacaoCadastro opCadastro;
	private Pessoa pessoa;
	private boolean confirmado;
	private DefaultComboBoxModel modelo;
	private JButton buttonContinuar;
	private JButton buttonCancelar;
	
	public static void main(String[] args) {
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }

	
	public boolean operacaoConfirmada() {
		return confirmado;
	}
	
	public TelaCadastro() {
		getContentPane().setBackground(new Color(128, 128, 192));
		setBounds(100, 100, 612, 424);
		getContentPane().setLayout(null);
		
		edNome = new JTextField();
		edNome.setBounds(100, 83, 203, 19);
		getContentPane().add(edNome);
		edNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastro Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(198, 23, 241, 29);
		getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(385, 82, 142, 21);
		getContentPane().add(comboBox);
		
		modelo = new DefaultComboBoxModel();
		comboBox.setModel(modelo);
		
		edTelefone = new JTextField();
		edTelefone.setColumns(10);
		edTelefone.setBounds(100, 123, 203, 19);
		getContentPane().add(edTelefone);
		
		edEmail = new JTextField();
		edEmail.setColumns(10);
		edEmail.setBounds(100, 163, 203, 19);
		getContentPane().add(edEmail);
		
		edBairro = new JTextField();
		edBairro.setColumns(10);
		edBairro.setBounds(100, 204, 203, 19);
		getContentPane().add(edBairro);
		
		edComplemento = new JTextField();
		edComplemento.setColumns(10);
		edComplemento.setBounds(385, 123, 203, 19);
		getContentPane().add(edComplemento);
		
		edNumero = new JTextField();
		edNumero.setColumns(10);
		edNumero.setBounds(385, 163, 203, 19);
		getContentPane().add(edNumero);
		
		edLogradouro = new JTextField();
		edLogradouro.setColumns(10);
		edLogradouro.setBounds(385, 203, 203, 19);
		getContentPane().add(edLogradouro);
		
		edCep = new JTextField();
		edCep.setColumns(10);
		edCep.setBounds(385, 252, 203, 19);
		getContentPane().add(edCep);
		
		edCidade = new JTextField();
		edCidade.setColumns(10);
		edCidade.setBounds(100, 252, 203, 19);
		getContentPane().add(edCidade);
				
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(24, 85, 45, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefone:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(24, 125, 66, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(24, 166, 66, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Bairro:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(24, 207, 66, 13);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Cidade:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(24, 255, 66, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Estado:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(322, 85, 53, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Complemento:");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(322, 125, 53, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Número:");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(322, 166, 53, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("Logradouro:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(322, 207, 53, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("Cep:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(322, 254, 53, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		buttonContinuar = new JButton("Continuar");
		buttonContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCadastro != OperacaoCadastro.consultar) {
					/*
					 * edNome.setText(pessoa.getNome());
					edTelefone.setText(pessoa.getTelefone());
					edEmail.setText(pessoa.getEmail());
					edBairro.setText(pessoa.getBairro());
					edCidade.setText(pessoa.getCidade());
					edComplemento.setText(pessoa.getComplemento());
					edNumero.setText(pessoa.getNumero());
					edLogradouro.setText(pessoa.getLogradouro());
					edCep.setText(pessoa.getCep());
					String cidade = (String) modelo.getSelectedItem();
					edCidade.setText(cidade);
					 */
					
					pessoa.setNome(edNome.getText());
					pessoa.setTelefone(edTelefone.getText());
					pessoa.setEmail(edEmail.getText());
					pessoa.setBairro(edBairro.getText());
					pessoa.setCidade(edCidade.getText());
					pessoa.setComplemento(edComplemento.getText());
					pessoa.setNumero(edNumero.getText());
					pessoa.setLogradouro(edLogradouro.getText());
					pessoa.setCep(edCep.getText());
					String estado = (String) modelo.getSelectedItem();
					pessoa.setEstado(estado);
					
					confirmado = true;
				}
				dispose();
			}
		});
		buttonContinuar.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonContinuar.setBounds(100, 312, 142, 21);
		getContentPane().add(buttonContinuar);
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonCancelar.setBounds(385, 313, 142, 21);
		getContentPane().add(buttonCancelar);
	}
	
	public TelaCadastro(java.awt.Frame parent, OperacaoCadastro opCadastro, Pessoa pessoa) {
		super(parent,true);
		confirmado = false;
		this.opCadastro = opCadastro;
		this.pessoa = pessoa;
		
		if(opCadastro == OperacaoCadastro.alterar || opCadastro == OperacaoCadastro.consultar) {
			edNome.setText(pessoa.getNome());
			edTelefone.setText(pessoa.getTelefone());
			edEmail.setText(pessoa.getEmail());
			edBairro.setText(pessoa.getBairro());
			edCidade.setText(pessoa.getCidade());
			edComplemento.setText(pessoa.getComplemento());
			edNumero.setText(pessoa.getNumero());
			edLogradouro.setText(pessoa.getLogradouro());
			edCep.setText(pessoa.getCep());
			String estado = (String) modelo.getSelectedItem();
			pessoa.setEstado(estado);
		}
		
		buttonCancelar.setVisible(opCadastro != OperacaoCadastro.consultar);
		edNome.setVisible(opCadastro != OperacaoCadastro.consultar);
		edTelefone.setVisible(opCadastro != OperacaoCadastro.consultar);
		edEmail.setVisible(opCadastro != OperacaoCadastro.consultar);
		edBairro.setVisible(opCadastro != OperacaoCadastro.consultar);
		edCidade.setVisible(opCadastro != OperacaoCadastro.consultar);
		edComplemento.setVisible(opCadastro != OperacaoCadastro.consultar);
		edNumero.setVisible(opCadastro != OperacaoCadastro.consultar);
		edLogradouro.setVisible(opCadastro != OperacaoCadastro.consultar);
		edCep.setVisible(opCadastro != OperacaoCadastro.consultar);
		edCidade.setVisible(opCadastro != OperacaoCadastro.consultar);
		
	}
	
	public static boolean executar(OperacaoCadastro opCadastro, Pessoa pessoa) {
		TelaCadastro tc = new TelaCadastro(null,opCadastro,pessoa);
		tc.setLocationRelativeTo(tc);
		tc.setVisible(true);
		return tc.operacaoConfirmada();		
	}

	
}
