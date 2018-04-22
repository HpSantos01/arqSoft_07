package Exercicio2_1_FactoryMethod;

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Anderson";
		String sobrenome = "Castro";
		
		fn.getNome(nome, sobrenome);

	}

}