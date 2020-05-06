import java.util.ArrayList;
import java.util.List;

public class Lista <T>  {

	List<T> listagem = new ArrayList<>();
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void AddValor(T valor) {
		
		listagem.add(valor);
	}
	
	
	public void PrimeiroItem() {
		System.out.println(listagem.get(0));
		
	}
	
	public void ListaCompleta() {
		
		System.out.print ("[ ");
		for(T t : listagem) {
			System.out.print(t + " ");
		}
		System.out.println ("]");

	}
	
	
	
}
