
public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("O imposto de renda é de 7.5%");
			System.out.println("Pode deduzir na declaração o valor de R$ 142.0");
		} else if(salario > 2800.0 && salario <= 3751.0) {
			System.out.println("O imposto de renda é de 15%");
			System.out.println("Pode deduzir na declaração o valor de R$ 350.0");
		} else if(salario > 3751 && salario <= 4664.0) {
			System.out.println("O imposto de renda é de 22.5%");
			System.out.println("Pode deduzir na declaração o valor de R$ 636.0");
		}
	}
}
