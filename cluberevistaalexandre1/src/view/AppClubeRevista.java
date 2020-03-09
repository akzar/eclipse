package view;

import model.Colecao;
import model.Revista;

class AppClubeRevista {

	public static void main(String[] args) {
		Colecao colecao = new Colecao();
		Revista revista = new Revista();

		colecao.setNome("Veja");
		colecao.setCodigo(1);

		revista.setCodigo(1);
		revista.setAno(2019);
		revista.setDescricao("Lula solto");
		revista.setEdicao(3);
		revista.setColecao(colecao);
		revista.setNome("Política");

		// System.out.println(colecao.mostrarInfo());
		System.out.println(revista);

	}

}
