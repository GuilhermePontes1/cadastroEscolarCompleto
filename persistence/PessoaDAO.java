package persistence;
import java.util.ArrayList;
import java.util.List;
import domain.Alunos;
import domain.Cadastro;
import domain.Professores;

public class PessoaDAO {

    public static List<Cadastro> list = new ArrayList<>();

    public static List<Cadastro> getList() {
        return list;
    }

    public static void setList(List<Cadastro> list) {
        PessoaDAO.list = list;
    }

    public static void addAlunos(Alunos alunos) {
        list.add(alunos);
    }

    public static void addProfessores(Professores prof) {
        list.add(prof);
    }
}
