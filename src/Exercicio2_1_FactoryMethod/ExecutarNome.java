package Exercicio2_1_FactoryMethod;

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Henrique";
		String sobrenome = "Pucci";
		
		fn.getNome(nome, sobrenome);

	}

}