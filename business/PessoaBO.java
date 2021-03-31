package business;

import domain.Alunos;
import domain.Cadastro;
import domain.Professores;
import persistence.PessoaDAO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PessoaBO {


    public static void addAlunos(Alunos alunos) {
        PessoaDAO.addAlunos(alunos);
    }

    public static List<Cadastro> obterPessoasOrdemNome() {
        List<Cadastro> list = PessoaDAO.getList();

        list.sort(Comparator.comparing(Cadastro::getNome));
        return list;
    }

    public static void addProfessores(Professores professores) {
        PessoaDAO.addProfessores(professores);

    }

}
