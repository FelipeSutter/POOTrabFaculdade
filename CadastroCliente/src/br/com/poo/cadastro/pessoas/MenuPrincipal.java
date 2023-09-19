package br.com.poo.cadastro.pessoas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem-Vindo(a), Usuário!");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setBounds(86, 21, 250, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Clique aqui para continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MostrarLista ml = new MostrarLista();
				ml.setLocationRelativeTo(ml);
				ml.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(128, 128, 192));
		btnNewButton.setBounds(102, 127, 202, 21);
		contentPane.add(btnNewButton);
		
		JButton buttonSair = new JButton("Clique aqui para Sair");
		buttonSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonSair, "Obrigado por utilizar o nosso Sistema!");
				dispose();
			}
		});
		buttonSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonSair.setBackground(new Color(128, 128, 192));
		buttonSair.setBounds(102, 158, 202, 21);
		contentPane.add(buttonSair);
		
		JLabel lblEsteUm = new JLabel("Este é um programa de Cadastro");
		lblEsteUm.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblEsteUm.setBounds(70, 60, 377, 57);
		contentPane.add(lblEsteUm);
	}
}
