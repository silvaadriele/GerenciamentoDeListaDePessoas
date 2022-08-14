package classes;
import java.util.Comparator;

//Classe que implementa a interface Comparator para ordenação da fila em ordem alfabética.
public class OrdenarPorNome implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa a, Pessoa b) {
	        return a.getNome().compareTo(b.getNome());
	}

}
