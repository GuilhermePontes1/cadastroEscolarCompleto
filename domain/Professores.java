package domain;

import enums.Titulacao;

public class Professores extends Cadastro{
	private Titulacao titulacao;
	
	
	public Professores(String nome, String nacionalidade, String telefone, Titulacao titulacao) {
		super(nome, nacionalidade, telefone);
		this.titulacao = titulacao;
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "#Professores#" +
				"\nTitulacao=" + titulacao +
				", \nNome='" + nome + '\'' +
				", \nNacionalidade='" + nacionalidade + '\'' +
				", \nTelefone='" + telefone + '\'' ;

	}
}
