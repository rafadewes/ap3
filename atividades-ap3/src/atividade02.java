/* Uma farmácia precisa ajustar os preços de seus produtos em 12%. 
Elabore uma classe que receba o valor do produto e aplique o 
percentual de acréscimo. O novo valor a ser calculado deve ser 
arredondado para mais ou para menos usando o método round. 
A classe deve também conter um laço de repetição que encerre o 
programa quando o usuário fornecer o valor zero (0) para o valor 
do produto. Dessa forma, o usuário digita o valor do produto, a 
classe calcula e mostra o valor com acréscimo, a seguir solicita 
um novo valor. Esse processo continua enquanto o valor do produto 
for diferente de zero; caso contrário o programa será encerrado*/
import java.util.Scanner;

public class atividade02 {
	public static void main(String[] args) {
		double valorProduto;
		
		do{
			System.out.println("Digite o valor do produto: ");
			Scanner tc = new Scanner(System.in);
			valorProduto = tc.nextDouble();
			valorProduto = valorProduto*1.12;
			valorProduto = Math.round(valorProduto);
			if(valorProduto != 0)
				System.out.println("O novo valor do produto é: " + valorProduto);
			
		}while(valorProduto != 0);
		System.out.println("Finalizado!");
	}
}
