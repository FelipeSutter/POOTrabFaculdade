/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrocliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author FACC
 */
public class TabelaPessoa extends AbstractTableModel{
    
    private static final int COLUNA_NOME = 0;
	private static final int COLUNA_TELEFONE = 1;
	private static final int COLUNA_EMAIL = 2;
	private static final int COLUNA_LOGRADOURO = 3;
	private static final int COLUNA_NUMERO = 4;
	private static final int COLUNA_COMPLEMENTO = 5;
	private static final int COLUNA_BAIRRO = 6;
	private static final int COLUNA_CIDADE = 7;
	private static final int COLUNA_ESTADO = 8;
	private static final int COLUNA_CEP = 9;
	private String[] colunas = new String[] {"Nome","Telefone","Email","Logradouro","Número","Complemento","Bairro","Cidade","Estado","Cep"};
	private List<Pessoa> pessoas;
	
	
	public TabelaPessoa(List<Pessoa> pessoas) {
		this.pessoas = new ArrayList<Pessoa>(pessoas);
	}

	@Override
	public int getRowCount() {
		return pessoas.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		Pessoa pessoa = pessoas.get(row);
		switch(column) {
			case COLUNA_NOME:
				return pessoa.getNome();
			case COLUNA_TELEFONE:
				return pessoa.getTelefone();
			case COLUNA_EMAIL:
				return pessoa.getEmail();
			case COLUNA_LOGRADOURO:
				return pessoa.getLogradouro();
			case COLUNA_NUMERO:
				return pessoa.getNumero();
			case COLUNA_COMPLEMENTO:
				return pessoa.getComplemento();
			case COLUNA_BAIRRO:
				return pessoa.getBairro();
			case COLUNA_CIDADE:
				return pessoa.getCidade();
			case COLUNA_ESTADO:
				return pessoa.getEstado();
			case COLUNA_CEP:
				return pessoa.getCep();
		}
		return "";
	}
	
	@Override
	public void setValueAt(Object aValue,int row, int column) {
		Pessoa pessoa = pessoas.get(row);
		switch(column) {
			case COLUNA_NOME:
				pessoa.setNome(aValue.toString());
				break;
			case COLUNA_TELEFONE:
				pessoa.setTelefone(aValue.toString());
				break;
			case COLUNA_EMAIL:
				pessoa.setEmail(aValue.toString());
				break;
			case COLUNA_LOGRADOURO:
				pessoa.setLogradouro(aValue.toString());
				break;
			case COLUNA_NUMERO:
				pessoa.setNumero(aValue.toString());
				break;
			case COLUNA_COMPLEMENTO:
				pessoa.setComplemento(aValue.toString());
				break;
			case COLUNA_BAIRRO:
				pessoa.setBairro(aValue.toString());
				break;
			case COLUNA_CIDADE:
				pessoa.setCidade(aValue.toString());
				break;
			case COLUNA_ESTADO:
				pessoa.setEstado(aValue.toString());
				break;
			case COLUNA_CEP:
				pessoa.setCep(aValue.toString());
				break;
		}
	}
	
	public Pessoa obterPessoa(int indice) {
		return pessoas.get(indice);
	}
	
	public void incluirPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		int ultimo = getRowCount()-1;
		fireTableRowsInserted(ultimo,ultimo);
	}
	
	public void atualizarPessoa(int indice, Pessoa pessoa) {
		pessoas.set(indice, pessoa);
		fireTableRowsUpdated(indice,indice);
	}
	
	public void excluirPessoa(int indice) {
		pessoas.remove(indice);
		fireTableRowsDeleted(indice,indice);
	}
    
}
