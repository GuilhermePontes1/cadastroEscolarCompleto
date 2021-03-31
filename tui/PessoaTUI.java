package tui;
import business.PessoaBO;
import domain.Cadastro;
import domain.ValorNaoInformadoException;
import persistence.PessoaDAO;
import java.util.List;
import java.util.Scanner;
import domain.Alunos;
import domain.Professores;
import enums.Titulacao;

public class PessoaTUI {
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) throws ValorNaoInformadoException {
	cadastrarPessoa();
	imprimir();
	}
	
	
	
	private static void cadastrarPessoa() throws ValorNaoInformadoException {
		System.out.println("Selecione uma opção: \n(1) Alunos\n(2) Professores");
		int n = sc.nextInt();

		while (n > 2) {
			System.out.println("Valor invalido ! \nSelecione uma opção para cadastro \\n(1) Alunos\\n(2) Professores");
			n = sc.nextInt();
		}
		if (n == 1) {
			cadastrarAlunos();
		}else if (n == 2){
			cadastrarProfessores();
		}
	}
	
	private static void cadastrarAlunos() throws ValorNaoInformadoException {
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.next();
		
		System.out.println("Digite a nacionalidade ");
		String nacionalidade = sc.next();
		
		System.out.println("Digite o telefone: ");
		String telefone = sc.next();
		
		System.out.println("Digite o ano de Nascimento DD/MM/AAAA: ");
		String anoNascimento = sc.next();
		
		System.out.println("Informe a escola anterior do aluno: ");
		String escolaAnterior = sc.next();
		
		Alunos alunos = new Alunos(nome,  nacionalidade,  telefone,  anoNascimento, escolaAnterior );

		PessoaBO.addAlunos(alunos);
	}
	private static void cadastrarProfessores() {
		System.out.println("Digite o nome do professor ");
		String nome = sc.next();
		
		System.out.println("Infome a nacionalidade: ");
		String nacionalidade = sc.next();
		
		System.out.println("Informe o telefone (opcional): ");
		String telefone = sc.next();
	
		String titulacao = "";
		Titulacao enumTitulacao = Titulacao.MESTRE;
		boolean isValid = false;
		do {
			
			System.out.println("Informe a titulação: ");
			titulacao = sc.next().toLowerCase();
			
			if(titulacao.equals("mestre")) {
				enumTitulacao = Titulacao.MESTRE;
				isValid = true;
			}
			else if (titulacao.equals("especialista")) {
				enumTitulacao = Titulacao.ESPECIALISTA;
				isValid = true;
			}
			else if (titulacao.equals("doutor")) {
				enumTitulacao = Titulacao.DOUTOR;
				isValid = true;
			}
			else {
				System.out.println("Digite uma titulacao valida!!! (mestre, doutor, especialista)");
			}
			
		}while(isValid == false);
		
		Professores prof = new Professores (nome, nacionalidade, telefone, enumTitulacao);
		PessoaBO.addProfessores(prof);

	}
	public static void imprimir(){
		List<Cadastro> list = PessoaBO.obterPessoasOrdemNome();

		for (Cadastro cadastro: list) {
			System.out.println(cadastro);
		}
	}

	}
	

	

	
