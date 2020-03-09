package model;

public class Colecao {

	private int codigo;
	private String nome;

	public String toString() {
		return "Código: " + codigo + "\nNOme: " + nome;

	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return this.nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
