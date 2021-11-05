// Classe Funcionario estende a Classe Pessoa
public class Funcionario extends Pessoa {
	
	// Atributos privados
	private float salario;
	private String funcao;

	// Construtor
	public Funcionario(String nome, String cpf, Endereco endereco, String celular, float salario, String funcao) {
		super(nome, cpf, endereco, celular);
		this.salario = salario;
		this.funcao = funcao;
	}

	// Método toString: retorna uma String com o nome, o cpf, o celular, a função e o salário do funcionário;
	@Override
	public String toString() {
		return "Nome = " + getNome() + 
				"\nCPF = " + getCpf() +
				"\nCelular = " + getCelular() +
				"\nSalário = " + this.salario + 
				"\nFunção = " + this.funcao;
	}
} 
