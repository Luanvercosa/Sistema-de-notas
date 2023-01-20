package boletim;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Boletim boletim = new Boletim();
		Scanner entrada = new Scanner(System.in);

		boolean exibirMenu = true;
		
		while (exibirMenu) {
			System.out.println("Seja bem vindo\n Digite sua opção: ");
			System.out.println("1 - Adicionar Aluno ");
			System.out.println("2 - Adicionar nota ");
			System.out.println("3 - Consultar nota ");
			System.out.println("4 - Calcular a média");
			System.out.println("5 - Listar alunos com maior nota");
			System.out.println("6 - Remover aluno");
			System.out.println("7 - Encerrar o programa");
			
			switch (entrada.nextLine()) {
			case "1": 
				boletim.AdicionarAluno();
				break;
			case "2":
				System.out.println("Informe o nome do aluno: ");
				String nomeAluno = entrada.nextLine();
				boletim.AdicionarNota(nomeAluno);
				break;
			case "3":
				System.out.println("Informe o nome do aluno: ");
				String nome = entrada.nextLine();
				boletim.ConsultarNota(nome);
				break;
				case "4":
					System.out.println("Informe o nome do aluno: ");
					String nomeAluno1 = entrada.nextLine();
					boletim.CalcularMedia(nomeAluno1);
					break;
				case "5": 
					boletim.ConsultarMaiorNota();
					break;
				case "6":
					boletim.RemoverAluno();
					break;
				case "7":
					exibirMenu = false;
					break;
				default: 
					System.out.println("Opção invalida, digite novamente: ");
					break;
	
			}
			System.out.println("Pressione enter para continuar");
			entrada.nextLine();
			
			}
			
		System.out.println("O programa se encerrou!");
		entrada.close();
		}
		
		
	}

