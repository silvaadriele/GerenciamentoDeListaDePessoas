package classes;
import java.util.Comparator;

//Classe que implementa a interface Comparator para ordenação da fila em ordem crescente de idade.
public class OrdenarPorIdade implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa a, Pessoa b) {
		return a.getIdade()- b.getIdade();
	}

}
