package view;

import model.Funcao;
import model.Funcionario;

public class AppFolha {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario('f');
		Funcao funcao = new Funcao(1,"Professor");
		
		funcionario.setNome("Glauco");
		funcionario.setFuncao("funcao");
		
		
		System.out.println(funcionario);
		System.out.println(funcionario1);

	}
	
	

}
