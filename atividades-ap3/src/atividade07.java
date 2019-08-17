//Para elevar um número a uma potência, usamos o método pow de Math.
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class atividade07 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = tc.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = tc.nextInt();
        double resultado = (Math.pow(numero, expoente));
        System.out.println(resultado);
    }
}