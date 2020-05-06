import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count, valor;
		String nome;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos valores deseja adicionar:");
		count = sc.nextInt();

		
		
		
		
		 Lista<String> l = new Lista();
		
		
		for (int i = 0; i < count; i++) {
			
			nome = sc.next();
			l.AddValor(nome);
		
			
		}
		
		l.PrimeiroItem();
		
		l.ListaCompleta();
		
		
		sc.close();
	}
	

}
