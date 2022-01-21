package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Luna", "Siamês", 2);
		Livro livro = new Livro();

		System.out.println(gato);
		System.out.println(livro);

	}
}

class Livro {
	public String nome;
	public Integer numPaginas;
}