
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		if(idade >= 18) {
			System.out.println("Você é maior de idade.");
			System.out.println("Seja bem-vindo");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado.");
			} else {
				System.out.println("Você não pode entrar");
			}
			
		}
	}
}
