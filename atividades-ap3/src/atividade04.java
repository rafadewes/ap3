import java.util.Scanner;

//Construa uma classe que receba uma frase qualquer e mostre essa frase de trás para a frente e sem espaços em branco,

public class atividade04 {
	public static void main(String[] args) {
		String frase = new String();
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = tc.nextLine();
		System.out.println(frase);
		frase = frase.replace(" ", "");
		StringBuilder rev = new StringBuilder(frase);
		rev = rev.reverse();
		System.out.println(frase);
		System.out.println(rev);
	}
}
