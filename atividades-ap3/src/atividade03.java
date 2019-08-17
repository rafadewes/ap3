/*Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random. 
Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma quantidade 
de dígitos correspondentes ao valor aleatório gerado. 
Apresente em tela o número sorteado e a senha.*/

public class atividade03 {
	public static void main(String[] args) {
		int numeroSorteado;
		String senha = new String();
		
		numeroSorteado = (int) (Math.random()*4)+5;
		
		for(int x=0; x!=numeroSorteado; x++) {
			senha = senha + (int) (Math.random()*9);
		}
		System.out.println("O numero sorteado é : "+ numeroSorteado);
		System.out.println("A senha é: " + senha);
		
	}
}
