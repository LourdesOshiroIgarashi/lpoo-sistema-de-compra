import java.util.ArrayList;
import java.util.Collections;

public class Compra{

	// Atributos privados
	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();
	
	// Construtor
	public Compra(Funcionario funcionario, Cliente cliente) {
		this.funcionario = funcionario;
		this.cliente = cliente;
	}
	
	// Método: adiciona o produto na compra
	public void adicionaProduto(Produto prod) {
		this.produtos.add(prod);	
	}
	
	// Método: ordena a lista de produtos da compra
	public void listarCompra() {
		// Método: ordena a lista em ordem crescente do menor para o maior valor do produto 
		Collections.sort(produtos);
		
		//inicializa a variavel para somar o total da compra
		float total = 0;
		
		//listar a lista de produtos
		for (Produto produto : produtos) {
			System.out.println(produto);
			//soma o total de cada produto da lista
			total += produto.getValor();
		}
		
		// Mostra o valor final da compra com 2 casas decimais
		System.out.printf("Total da compra: %.2f\n", total);
		// Mostra o funcionário que efetuou a compra
		System.out.println("Funcionário: " + funcionario.getNome());
		// Mosgra o cliente que comprou
		System.out.println("Cliente: " + cliente.getNome());
	}
}