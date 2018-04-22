package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author José Roberto Xavier da Silva
 * 			816113694
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}
