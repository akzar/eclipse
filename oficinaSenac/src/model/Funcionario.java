package model;

import java.sql.Date;

public class Funcionario {
	private int codFuncioanrio, idFuncionario;
	private String nomeFuncionario, telefoneFuncionario, logradouroFuncionario, bairroFuncionario, cidadeFuncionario,
			cepFuncionario;
	private Date nascimentoFuncionario;
	private char sexoFuncionario, dddFuncionario, estadoFuncionario;
	private long cpfFuncionario;
	private Empresa funcionarioEmpresa;
	private Departamento funcionarioDepartamento;
	private Setor funcionarioSetor;
	private Cargo funcionarioCargo;

}
