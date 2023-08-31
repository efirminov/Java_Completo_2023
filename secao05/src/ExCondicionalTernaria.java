public class ExCondicionalTernaria {

	public static void main(String[] args) {

		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		System.out.println("Desconto: " + desconto);

		// Exemplo de condição Ternaria
		double descont = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println("Desconto: " + descont);
	}
}
