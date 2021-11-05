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

	// M�todo toString: retorna uma String com o nome, o cpf, o celular, a fun��o e o sal�rio do funcion�rio;
	@Override
	public String toString() {
		return "Nome = " + getNome() + 
				"\nCPF = " + getCpf() +
				"\nCelular = " + getCelular() +
				"\nSal�rio = " + this.salario + 
				"\nFun��o = " + this.funcao;
	}
} 
