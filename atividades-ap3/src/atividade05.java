/*Elabore uma classe que receba uma frase e verique que se essa
frase possui palavras impróprias. As palavras impróprias são: sexo e sexual. 
Caso encontre uma dessas palavras, emita em tela a mensagem “conteúdo impróprio”, 
caso contrário “conteúdo liberado”*/

import java.util.Scanner;

public class atividade05 {
	public static void main(String[] args) {
		String frase = new String();
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = tc.nextLine();
		if((frase.contains("sexo")) || (frase.contains("sexual")) ) {
			System.out.println("Conteudo imprópio");
		}else { 
			System.out.println("Conteudo liberado");
		}
		
	}
}
