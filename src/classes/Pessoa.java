package classes;

//classe Pessoa com atributos, getters and setters e toString.
public class Pessoa{
	private String nome;
	private int idade;
	private String categoria;
	
	
	public Pessoa (String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	
	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		if (getCategoria() == null) {
			return "Nome: "+nome+" || Idade: "+idade;
		}
		else {
			return "Nome: "+nome+" || Idade: "+idade+" || Categoria: "+categoria;
		}
	}

	
}
