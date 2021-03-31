package domain;

public class Alunos extends Cadastro {
    private String anoNascimento;
    private String escolaAnterior;

    public Alunos(String nome, String nacionalidade, String telefone, String anoNascimento,
                  String escolaAnterior) throws ValorNaoInformadoException {

        super(nome, nacionalidade, telefone);
        this.anoNascimento = anoNascimento;
        this.escolaAnterior = escolaAnterior;

        if (telefone == null) {
            throw new ValorNaoInformadoException("telefone obrigatorio!", null);
        }
        if (telefone.equals("")) {
            throw new ValorNaoInformadoException("telefone obrigatorio!", null);
        }

    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEscolaAnterior() {
        return escolaAnterior;
    }

    public void setEscolaAnterior(String escolaAnterior) {
        this.escolaAnterior = escolaAnterior;
    }

    public String getTelefone() {
        return this.telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "#Alunos#" +
                "\nAnoNascimento=" + anoNascimento +
                "\nEscolaAnterior='" + escolaAnterior + '\'' +
                "\nNome='" + nome + '\'' +
                "\nnacionalidade='" + nacionalidade + '\'' +
                "\nTelefone='" + telefone + "'";

    }
}
