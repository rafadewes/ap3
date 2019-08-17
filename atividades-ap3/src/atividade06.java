/* Crie uma classe que exiba o substring de uma 
string FRASE composto por todos os caracteres de 
FRASE exceto o último caracter.*/
import java.util.Scanner;

public class atividade06 {
	public static void main(String[] args) {
		String frase = new String();
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = tc.nextLine();
		frase = frase.substring(0,frase.length()-1);
		System.out.println(frase);
	}

}
