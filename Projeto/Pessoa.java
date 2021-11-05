// Classe Pessoa implementa a Classe Verificavel

import java.util.Scanner;

public abstract class Pessoa implements Verificavel {
	
	// Atributos privados: nome, cpf, endereco, celular;
	private String nome;
	private String cpf;
	private Endereco endereco;
	private String celular;
	
	Scanner input = new Scanner(System.in);
	
	// Construtor
	public Pessoa(String nome, String cpf, Endereco endereco, String celular) {
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		
		this.cpf = cpf;
		validar(cpf);
		// Valida o cpf, até que o valor do CPF informado esteja correto
		while(validar(this.cpf) != true) {
			solicitarNovo(); 
			validar(this.cpf);
		}
	}
	
	// Métodos: gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	// Assinatura da interface verificavel
	@Override
	public boolean validar(String cpf) {
		// Substituição dos caracteres especiais por uma concatenação
		cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
		
        if(cpf.length() == 11) {
	        try{
	            Long.parseLong(cpf);
	        } 
	        catch(NumberFormatException e){
	        return false;
	        }
	
	        int d1, d2;
	        int digito1, digito2, resto;
	        int digitoCPF;
	        String nDigResult;
	
	        d1 = d2 = 0;
	        digito1 = digito2 = resto = 0;
	
	        for (int nCount = 1; nCount < cpf.length() - 1; nCount++) {
	        digitoCPF = Integer.valueOf(cpf.substring(nCount - 1, nCount)).intValue();
	
	        // multiplica a ultima casa por 2, em seguinte por 3 em seguinte por 4, e assim por diante
	        d1 = d1 + (11 - nCount) * digitoCPF;
	
	        // para o segundo digito, é repetido o procedimento, incluindo o primeiro digito calculado no passo anterior
	        d2 = d2 + (12 - nCount) * digitoCPF;
	        }
	
	        // Primeiro resto da divisão por 11
	        resto = (d1 % 11);
	
	        // Se o resultado for 0 ou 1 o digito é 0, caso contrário, o digito é 11 menos o resultado anterior
	        if (resto < 2)
	        digito1 = 0;
	        else
	        digito1 = 11 - resto;
	
	        d2 += 2 * digito1;
	
	        // Segundo resto da divisão por 11
	        resto = (d2 % 11);
	
	        // Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior
	        if (resto < 2)
	        digito2 = 0;
	        else
	        digito2 = 11 - resto;
	
	        // Digito verificador do CPF que está sendo validado
	        String nDigVerific = cpf.substring(cpf.length() - 2, cpf.length());
	
	        // Concatena o primeiro resto com o segundo
	        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
	
	        // Compara o digito verificador do cpf com o primeiro resto + o segundo resto
	        return nDigVerific.equals(nDigResult);
        }
        else {
        	return false;
        }
	}

	// Método: solicita novo cpf
	@Override
	public void solicitarNovo(){
		System.out.println("CPF é inválido, digite um CPF válido: ");
		this.cpf = input.nextLine();
	}
}
