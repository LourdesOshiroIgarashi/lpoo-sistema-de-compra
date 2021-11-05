public class Produto implements Comparable<Produto> {
	
	// Atributos privados
	private String nomeProduto; 
	private Float valor; 
	private Fornecedor fornecedor;
	
	// M�todos: gets e sets
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	// Construtor
	public Produto(String nomeProduto, Float valor, Fornecedor fornecedor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	
	// M�todo: compara os produtos pelo valor
	@Override
    public int compareTo(Produto prod) {
        return (int) (this.getValor() - prod.getValor());
    }
	
	// M�todo toString: retorna uma String
	@Override
	public String toString() {
		return "Produto = " + nomeProduto + "\nValor = " + valor + "\n";
	}
}
