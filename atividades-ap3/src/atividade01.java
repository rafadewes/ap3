 /*Crie uma classe que simule a jogada de um dado de seis lados 
 (números de 1 a 6) por três vezes. Ao  final some seus valores
 e apresente o resultado das três jogadas.*/

public class atividade01 {
	public static void main(String[] args) {
		int total=0;
		System.out.println("As jogadas são: ");
		for(int x=0; x<3; x++){
			int jogada = (int) (Math.random()*5)+1;
			total = total + jogada;
			System.out.println(jogada);	
		}
		
		System.out.println("A soma das jogadas é: " + total);	
	}
}
