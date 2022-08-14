package classes;
import java.util.ArrayList;
import java.util.Scanner;

//Classe que contém a estrutura geral do menu, quando é chamado cada método.
public class Menu {
	private int opcao;
	Scanner s = new Scanner(System.in);
	
	public void imprimirMenuGerenciamento(ArrayList<Pessoa> pessoas) {
		Gerenciamento g = new Gerenciamento();
		boolean continuar=true;
		
		while (continuar) {
			System.out.println("***Agora vamos adiante!***\nDigite 1 para adicionar uma pessoa\nDigite 2 para ordenar a fila por idade"
					+ "\nDigite 3 para ordenar a fila por nome\nDigite 4 para categorizar os participantes por idade\nDigite 5 para imprimir lista"
					+ "\nDigite 6 para deletar alguém\nDigite 7 para finalizar\n\n");
			try {
				opcao = Integer.parseInt(s.nextLine());
			}catch(Exception e) {
				System.out.println("Entrada inválida!");
				
			}
			
			
			switch(opcao) {
			case 1:
				g.adicionarPessoa(pessoas);
				break;
			
			case 2:
				try {
					g.ordenarPorIdade(pessoas);
					System.out.println("Lista de pessoas ordenada por idade: ");
					g.imprimirPessoas(pessoas);
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 3:
				try {
					g.ordenarPorNome(pessoas);
					System.out.println("Lista de pessoas ordenada por nome: ");
					g.imprimirPessoas(pessoas);
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 4:
				try {
					g.categorizarPessoas(pessoas);
					System.out.println("Lista de pessoas com as categorias: ");
					g.imprimirPessoas(pessoas);
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 5:
				try {
					g.imprimirPessoas(pessoas);
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 6:
				try {
					g.deletarPessoa(pessoas);
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 7:
				continuar =false;
				break;
			
			default:
				System.out.println("Opção inválida!");
			
			}
		}
	}
}
