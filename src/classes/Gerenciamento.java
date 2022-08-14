package classes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Classe que contém todos os métodos utilizados no gerenciamento.
public class Gerenciamento{
	
	public boolean criandoBaseDe(ArrayList<Pessoa> pessoas, int numeroDePessoas) {
		if (numeroDePessoas>0) {
			for (int i=0; i<numeroDePessoas; i++){
				adicionarPessoa(pessoas);
			}
			return true;
		}
		return false;
	}
	
	public void adicionarPessoa(ArrayList<Pessoa> pessoas) {
		Scanner scanner1 = new Scanner(System.in);
		String nome = null;
		int idade = 0;
		do {
			System.out.println("Digite o nome da pessoa para adicionar: ");
			try {
				nome = scanner1.nextLine();
			}catch (Exception e) {
				System.out.println("Entrada inválida!");
			}
			System.out.println("Digite a idade da pessoa para adicionar: ");
			try{
				idade = Integer.parseInt(scanner1.nextLine());
			}catch (Exception e) {
				System.out.println("Entrada inválida!");
			}
			if (idade<=0) {
				System.out.println("Idade inválida, entrada desconsiderada.");
			}
		}while(nome==null || idade<=0);
		
		Pessoa pessoa = new Pessoa(nome, idade);
		pessoas.add(pessoa);
			
	}
	
	public void deletarPessoa(ArrayList<Pessoa> pessoas) {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Digite a posição da pessoa para excluir: ");
		int index = Integer.parseInt(scanner1.nextLine());
		index--;
		
		verificaPosicaoDaLista(index, pessoas);
		pessoas.remove(index);
	}
	
	public void imprimirPessoas(ArrayList<Pessoa> pessoas) {
		verificaLista(pessoas);
		for (Pessoa pessoa : pessoas) 
			System.out.println(pessoa);
	}
	
	public void ordenarPorIdade(ArrayList <Pessoa> pessoas) {
		verificaLista(pessoas);
		Collections.sort(pessoas, new OrdenarPorIdade());
	}
	
	public void ordenarPorNome(ArrayList <Pessoa> pessoas) {
		verificaLista(pessoas);
		Collections.sort(pessoas, new OrdenarPorNome());
	}
	
	public void categorizarPessoas(ArrayList <Pessoa> pessoas) {
		verificaLista(pessoas);
		for (int i =0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getIdade() < 12)
				pessoas.get(i).setCategoria("Criança");
			else if (pessoas.get(i).getIdade() <= 19)
				pessoas.get(i).setCategoria("Adolescente");
			else if(pessoas.get(i).getIdade() < 65)
				pessoas.get(i).setCategoria("Adulto");
			else 
				pessoas.get(i).setCategoria("Idoso");
		}
			
	}
	private void verificaPosicaoDaLista(int index, ArrayList<Pessoa> pessoas) {
		if(index>=pessoas.size()) {
			throw new RuntimeException("Posição não encontrada\n");
		}
	}
	private void verificaLista(ArrayList <Pessoa> pessoas){
		if (pessoas.get(0)==null) 
			throw new RuntimeException("Não há lista existente neste momento\n");
	}

}







