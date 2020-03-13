package model;

public class Funcionario {
	private String nome, cpf, numCarteira, dataAdmissao;
	private double salario;
	private boolean ativo;
	private int matricula;
	private char sexo;
	private Funcao funcao;

	// metodo construtor usado para instanciar o objeto

	public Funcionario() {
		sexo = 'm';
		ativo = true;
		salario = 1040;
		nome = "Glauco";

	}

	public String toString() {
		return 
				"Nome : " + nome + "\nSexo: " + sexo + 
				"\nSalario: " + salario + "\nAtivo: " + ativo+"\nFuncao"+getNome();

	}

	public Funcionario(int matricula) {
		this.matricula = matricula;
	}

	public Funcionario(String nome, String cpf, String numCarteira, String dataAdmissao, double salario, boolean ativo,
			int matricula, char sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numCarteira = numCarteira;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.ativo = ativo;
		this.matricula = matricula;
		this.sexo = sexo;
	}

	public Funcionario(char sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = "Glauco";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumCarteira() {
		return numCarteira;
	}

	public void setNumCarteira(String numCarteira) {
		this.numCarteira = numCarteira;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setFuncao(String string) {
		// TODO Auto-generated method stub
		
	}

}
