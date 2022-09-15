package lista7;

import java.util.Scanner;

public class e1  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int numero1[] = new int[10];
        int numero2[] = new int[10];
        int numero3[] = new int[10];
        for (int i =0; i < numero1.length; i++) {
        	System.out.println("Digite o "+(i+1)+"º número do 1º vetor");
        	numero1[i] = ler.nextInt();
        	System.out.println("Digite o "+(i+1)+"º número do 2º vetor");
        	numero2[i] = ler.nextInt();
        	numero3[i] = numero1[i] - (numero2[i]*numero1[i]);
        }
        for (int i=0; i < numero1.length; i++) {
        	System.out.println("Numero3["+i+"] = "+numero3[i]);
        }
        ler.close();
	}
}
