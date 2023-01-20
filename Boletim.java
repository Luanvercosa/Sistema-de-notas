package boletim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boletim {
	// Declarando as variaveis
    String nomeAluno; 
    double nota1;
    double nota2;
    // Dois booleans para fazer verificação em alguns métodos
    boolean nota1Entrada = false;
    boolean nota2Entrada = false;
    // chama uma array do tipo string
    List<String> aluno = new ArrayList<String>(); 
    Scanner entrada = new Scanner(System.in);
    
    void AdicionarAluno() { // Método adicionarAluno!
        System.out.println("Digite o nome do aluno para adicionar a nota:  ");
        nomeAluno = entrada.nextLine();
        aluno.add(nomeAluno.toUpperCase());
    }
    
    void AdicionarNota(String nomeAluno) { // Método AdicionarNota, utilizado para adicionar as duas notas do aluno
        if (!aluno.contains(nomeAluno.toUpperCase())) { // Aqui pergunta se não houver alunos, não adiciona a nota;
            System.out.println("Aluno não encontrado");
            return;
        }
        boolean exibirMenu = true;
        while (exibirMenu) { // repetição utilizada para perguntar qual semestre você quer adicionar a nota;
            System.out.println("Qual semestre? ");
            System.out.println("1 - 1° semestre");
            System.out.println("2 - 2° semestre");
            System.out.println("3 - para sair");
            switch (entrada.nextLine()) {
                case "1" :
                    System.out.println("Ok! 1°  semestre");
                    System.out.println("Adicione a primeira nota: ");
                    nota1 = entrada.nextDouble();
                    nota1Entrada = true;
                    break;
                case "2":
                    System.out.println("Ok! 2° semestre");
                    System.out.println("Adicione a segunda  nota: ");
                    nota2 = entrada.nextDouble();
                    nota2Entrada = true;
                    break;
                case "3":
                    exibirMenu = false;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            System.out.println("Pressione enter para confirmar ");
            entrada.nextLine();
        }
    }
    
    void ConsultarNota(String nomeAluno) {
        if (!aluno.contains(nomeAluno.toUpperCase())) { // Aqui o método ConsultarNota também é utilizado somente se houver aluno
            System.out.println("Aluno não encontrado");
            return;
        } // Quando tem, ele divulga as duas notas
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
    
    void CalcularMedia(String nomeAluno) { // O método CalcularMedia também é utilizado somente quando houver aluno
        if (!aluno.contains(nomeAluno.toUpperCase())) {
            System.out.println("Aluno não encontrado");
            return;
        } // Aqui só pode calcular a média se houver ao menos uma nota;
        if(!nota1Entrada || !nota2Entrada){
            System.out.println("Entre as notas primeiro");
            return;
        }
        double resultado = (nota1 + nota2) / 2;
        System.out.println("A média de " + nomeAluno + " é " + resultado);
        if (resultado >= 6) {
            System.out.println(nomeAluno + " foi Aprovado!");
        } else {
            System.out.println(nomeAluno + " foi reprovado!");
        }
    }

    void ConsultarMaiorNota() {
        String alunoMaiorNota = "";
        double maiorNota = 0;
        for (String nome : aluno) {
            if (!nota1Entrada || !nota2Entrada) {
                continue;
            }
            double media = (nota1 + nota2) / 2;
            if (media > maiorNota) {
                maiorNota = media;
                alunoMaiorNota = nome;
            }
        }
        if (alunoMaiorNota.equals("")) {
            System.out.println("Nenhuma nota foi cadastrada.");
        } else {
            System.out.println("O aluno com a maior nota é " + alunoMaiorNota + " com média " + maiorNota);
        }
    }
    
    void RemoverAluno() {
        System.out.println("Digite o nome do aluno para Remover:  ");
        nomeAluno = entrada.nextLine();
        if(aluno.contains(nomeAluno.toUpperCase())) {
        	
        	aluno.remove(nomeAluno.toUpperCase());
        	System.out.println("Aluno removido com sucesso!");
        }else {
        	System.out.println("Aluno não encontrado.");
        }
       
    }
    }


