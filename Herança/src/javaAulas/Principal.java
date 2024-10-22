package javaAulas;

public class Principal {

	public static void main(String[] args) {
		
		Fisica fis = new Fisica();
		fis.nome = "MARIA";
		fis.cpf = "09372726353";
		fis.rg = "09384756474";
		fis.situacaoCadastral = "A";
		
		Juridica jur = new Juridica();
		jur.cnpj = "48575646354";
		jur.nome = "CASAS GIGA";
		jur.inscricaoCadastral = "83745354474";
		jur.situacaoCadastral = "I";
		
		System.out.println("Dados da pessoa física:");
		System.out.println(fis.toString());
		System.out.println("Dados da pessoa jurídica:");
		System.out.println(jur.toString());
	}

}
