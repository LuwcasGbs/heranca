package Herenca;

public class Principal {

	public static void main(String[] args) {
		
		//criando uma pessoa
		Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
		System.out.println("Pessoa: ");
		System.out.println("nome: "+pessoa.getNome());
		System.out.println("Telefone: "+pessoa.getTelefone());
		System.out.println("--------------------------------");
		
		//criando uma pessoa física
		PessoaFisica pessoafisica = new PessoaFisica("João da Silva","(11) 9999-9999","123-456-789-00","300-000");
		System.out.println("Pessoa Física: ");
		System.out.println("nome: "+pessoafisica.getNome());
		System.out.println("Telefone: "+pessoafisica.getTelefone());
		System.out.println("CPF: "+pessoafisica.getCpf());
		System.out.println("RG: "+pessoafisica.getRg());
		System.out.println("--------------------------------");
		
		//criando uma pessoa jurídica
		PessoaJuridica pessoajuridica = new PessoaJuridica("Empresa XYZ","(11) 9999-9999","12.345.678/9001-2");
		System.out.println("Pessoa Jurídica: ");
		System.out.println("nome: "+pessoajuridica.getNome());
		System.out.println("Telefone: "+pessoajuridica.getTelefone());
		System.out.println("CPF: "+pessoajuridica.getCnpj());
		System.out.println("--------------------------------");

	}

}
