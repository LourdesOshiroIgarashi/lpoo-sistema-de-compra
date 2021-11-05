import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		
		float valorProduto=0.0f, salarioFuncionario=0.0f;
		
		// Exceção para tratar entradas inválidas
		try {
		System.out.println("Digite o valor do produto: ");
		valorProduto = sc.nextFloat();
		}catch(InputMismatchException  e) {
			System.out.println("Valor de entrada incorreto");
		}
		
		// 6 endereços
		Endereco end1 = new Endereco("Av. Costa e Silva", 2001, "Universitário", "Campo Grande", "79070-900");
        Endereco end2 = new Endereco("Av. Afonso Pena", 2002, "Centro", "Campo Grande", "79065-555");
        Endereco end3 = new Endereco("Rua do Parque", 2003, "Centro", "Campo Grande", "79065-190");
        Endereco end4 = new Endereco("Av. Nelly Martins", 2004, "Portal Itayara", "Campo Grande", "79065-190");
        Endereco end5 = new Endereco("Rua Coronel Zózimo", 2005, "Monte Castelo", "Campo Grande", "79065-190");
        Endereco end6 = new Endereco("Rua Barueri", 2006, "Moreninha II", "Campo Grande", "79065-190");

        try {
			System.out.println("Digite o salário do funcionário: ");
			sc.nextLine();
			salarioFuncionario = sc.nextFloat();
		}catch(InputMismatchException e) {
			String r = e.getMessage();
			System.out.println(r);
		}
        
        // 2 funcionarios
        Funcionario func1 = new Funcionario("Everton", "33333333333", end1, "67999464219",  1000, "Feirante");
        Funcionario func2 = new Funcionario("Lourdes", "22222222222", end2, "67999898985", salarioFuncionario, "Feirante");
        
        // 2 clientes
        Cliente cli1 = new Cliente("Eduardo", "07435925144", end3, "67999464221");
        Cliente cli2 = new Cliente("Thiago", "50093037", end4, "67999464220");
        
        // 2 fornecedores
		Fornecedor empresa1 = new Fornecedor("barraca no mercadão municipal", "GOOOL", "52393813000192", end5, "67999464219");
		Fornecedor empresa2 = new Fornecedor("barraca na feira central", "TAM", "5239381300019", end5, "67999464219");
		
		// 10 produtos
		Produto produto1 = new Produto("Morango", 8f, empresa1);
		Produto produto2 = new Produto("Macadâmia", valorProduto, empresa1);
		Produto produto3 = new Produto("Manga", 90f, empresa1);
		Produto produto4 = new Produto("Mexerica", 4f, empresa1);
		Produto produto5 = new Produto("Mamão", 88f, empresa2);
		Produto produto6 = new Produto("Mirtilo", 6.5f, empresa2);
		Produto produto7 = new Produto("Melancia", 7.0f, empresa2);
		Produto produto8 = new Produto("Melão", 8.5f, empresa2);
		Produto produto9 = new Produto("Maça", 9.5f, empresa1);
		Produto produto10 = new Produto("Maracujá", 0.5f, empresa1);
		
		// 2 compras (listas)
		Compra compra1 = new Compra(func1, cli1);
		Compra compra2 = new Compra(func2, cli2);
		
		// Adiciona produto a lista de compra
		compra1.adicionaProduto(produto1);
		compra1.adicionaProduto(produto2);
		compra1.adicionaProduto(produto3);
		compra1.adicionaProduto(produto4);
		compra1.adicionaProduto(produto5);
		compra2.adicionaProduto(produto6);
		compra2.adicionaProduto(produto7);
		compra2.adicionaProduto(produto8);
		compra2.adicionaProduto(produto9);
		compra2.adicionaProduto(produto10);
		
		// Imprime a lista de compra
		System.out.println("\n**********COMPRA 1**********\n");
		compra1.listarCompra();
		System.out.println("\n**********COMPRA 2**********\n");
		compra2.listarCompra();
		
		// Imprime a lista de clientes, funcionarios e fornecedores
		System.out.println("\n**********CLIENTES**********\n");
		System.out.println("Cliente 1 \n" + cli1.toString() + "\n");
		System.out.println("Cliente 2 \n" + cli2.toString());
		
		System.out.println("\n**********FUNCIONARIOS**********\n");
		System.out.println("Funcionario 1 \n" + func1.toString() + "\n");
		System.out.println("Funcionario 2 \n" + func2.toString());
		
		System.out.println("\n**********FORNECEDORES**********\n");
		System.out.println("Fornecedor 1 \n" + empresa1.getNomeFantasia() + "\n");
		System.out.println("Fornecedor 2 \n" + empresa2.getNomeFantasia());
		
		System.out.println("\n********************************");
	}
}
