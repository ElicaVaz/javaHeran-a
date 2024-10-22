package javaAulas;

public class Juridica extends Pessoa {
	
	public String cnpj;
	public String inscricaoCadastral;
	@Override
	public String toString() {
		return "Juridica [cnpj=" + cnpj + ", inscricaoCadastral=" + inscricaoCadastral + ", nome=" + nome
				+ ", situacaoCadastral=" + situacaoCadastral + "]";
	}
	
	

}
