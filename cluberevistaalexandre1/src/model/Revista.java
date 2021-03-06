package model;

public class Revista {
	private int codigo, ano, edicao;
	private String nome, descricao;
	private Colecao colecao;

	@Override
	public String toString() {
		return "Revista \ncodigo: " + codigo + "\nano: " + ano + "\nedicao: " + edicao + "\nnome: " + nome
				+ ", descricao: " + descricao + "\ncolecao: " + colecao.getNome();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Colecao getColecao() {
		return colecao;
	}

	public void setColecao(Colecao colecao) {
		this.colecao = colecao;
	}

}
