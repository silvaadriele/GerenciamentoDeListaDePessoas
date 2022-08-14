package classes;
import java.util.ArrayList;
import java.util.Scanner;

//Classe que contem o método main, recebe entradas pelo teclado através da classe Scanner.
public class Main {
	
	public static void main (String[] args){
		ArrayList<Pessoa> pessoas = new ArrayList<>();	
		Menu menu = new Menu();
		Gerenciamento g = new Gerenciamento();
		Scanner s = new Scanner (System.in);
		int numeroDePessoas = 0;
		
		System.out.println("***Seja bem vindo!***\n");
		
		do {
			System.out.println("[BASE INICIAL DE DADOS] Digite quantas pessoas deseja adicionar:\n");
			try{
				numeroDePessoas = Integer.parseInt(s.nextLine());
			}catch(Exception e) {
				System.out.println("Entrada inválida!");
			}
		}while (g.criandoBaseDe(pessoas, numeroDePessoas)==false);
		
		menu.imprimirMenuGerenciamento(pessoas);
		System.out.println("[PROGRAMA FINALIZADO] Até a próxima!");	
		
		
		s.close();
		}
	}

