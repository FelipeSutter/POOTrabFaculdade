package br.com.poo.cadastro.pessoas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarLista extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTable tabela;
	
	private TabelaPessoa tabelaPessoa;
	private JButton buttonAlterar;
	
	public MostrarLista(java.awt.Frame parent, boolean modal) {
		super(parent,modal);
		tabelaPessoa = new TabelaPessoa(new ArrayList<>());
		tabela.setModel(tabelaPessoa);
		
	}

	public MostrarLista() {
		getContentPane().setBackground(new Color(128, 128, 192));
		setBounds(100, 100, 679, 408);
		getContentPane().setLayout(null);
		
		tabela = new JTable();
		tabela.setBounds(30, 64, 443, 283);
		getContentPane().add(tabela);
		
		JLabel lblNewLabel = new JLabel("Listar Clientes");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setBounds(30, 23, 204, 31);
		getContentPane().add(lblNewLabel);
		
		JButton buttonIncluir = new JButton("Incluir");
		buttonIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa = new Pessoa();
				if(TelaCadastro.executar(OperacaoCadastro.incluir, pessoa)) {
					tabelaPessoa.incluirPessoa(pessoa);
				}
			}
		});
		buttonIncluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonIncluir.setBounds(511, 80, 122, 21);
		getContentPane().add(buttonIncluir);
		
		buttonAlterar = new JButton("Alterar");
		buttonAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = tabela.getSelectedRow();
				if(indice >= 0) {
					Pessoa pessoa = tabelaPessoa.obterPessoa(indice);
					if(TelaCadastro.executar(OperacaoCadastro.alterar, pessoa)) {
						tabelaPessoa.atualizarPessoa(indice, pessoa);
					}
				}
			}
		});
		buttonAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonAlterar.setBounds(511, 135, 122, 21);
		getContentPane().add(buttonAlterar);
		
		JButton buttonExcluir = new JButton("Excluir");
		buttonExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = tabela.getSelectedRow();
				if(indice >= 0) {
					tabelaPessoa.excluirPessoa(indice);
				}
			}
		});
		
		buttonExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonExcluir.setBounds(511, 192, 122, 21);
		getContentPane().add(buttonExcluir);
		
		JButton buttonSelecionar = new JButton("Selecionar");
		buttonSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = tabela.getSelectedRow();
				if(indice >= 0) {
					Pessoa pessoa = tabelaPessoa.obterPessoa(indice);
					TelaCadastro.executar(OperacaoCadastro.consultar, pessoa);
				}
			}
		});
		
		buttonSelecionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonSelecionar.setBounds(511, 244, 122, 21);
		getContentPane().add(buttonSelecionar);
		
		JButton buttonMenu = new JButton("Menu");
		buttonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuPrincipal mp = new MenuPrincipal();
				mp.setLocationRelativeTo(mp);
				mp.setVisible(true);
			}
		});
		buttonMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonMenu.setBounds(511, 295, 122, 21);
		getContentPane().add(buttonMenu);
	}
}
