
public class TestaEscopo {

	public static void main(String[] args) {
		
		int idade = 20;
		int quantidadePessoas = 1;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado: " + acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
