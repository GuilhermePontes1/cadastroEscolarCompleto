package domain;

public abstract class Cadastro {
	
	protected String nome;
	protected String nacionalidade;
	protected String telefone;
	
	public Cadastro (String nome, String nacionalidade, String telefone) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	
}

