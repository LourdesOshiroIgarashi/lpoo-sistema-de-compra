// Classe Cliente estende a Classe Pessoa
public class Cliente extends Pessoa {

	// Construtor
	public Cliente(String nome, String cpf, Endereco endereco, String celular) {
		super(nome, cpf, endereco, celular);
	}
	
	// Método - Retornar uma String com o nome, o cpf e o celular do cliente
	@Override
	public String toString() {
		return "Nome = " + getNome() + 
				"\nCPF = " + getCpf() +
				"\nCelular = " + getCelular();
	}	
}
