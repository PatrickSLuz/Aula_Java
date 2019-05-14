import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler;
		
		int idade = 0;

		while (idade == 0) {
			
			ler = new Scanner(System.in);
			
			System.out.print("Digite sua idade: ");
			
			try {
				// dentro do try
				// codigo que pode gerar exception.
				idade = ler.nextInt(); // se esta linha gerar uma excessao o programa vai direto para o catch, ignorando o que estiver abaixo.
				
			} catch (InputMismatchException e) { // InputMismatchException - erro para entrada de teclado incorreta.
				System.out.println("Digite somente numeros.");
				//e.printStackTrace(); // printar a exception.
			}
		}
		
		System.out.println("A idade é: "+ idade);
		
	}

}
