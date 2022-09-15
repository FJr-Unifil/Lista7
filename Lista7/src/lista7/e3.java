package lista7;

import java.util.Scanner;

public class e3  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int numeros[] = new int[6];
        int pares[] = new int[6];
        int impares[] = new int[6];
        int par=0, impar=0;
        int somaPar=0, somaImpar=0;
        for (int i = 0; i < numeros.length; i++) {
        	pares[i] = 1;
        	impares[i] = 0;
        	System.out.println("Digite o "+(i+1)+"º número de 6");
        	numeros[i] = ler.nextInt();
            if (numeros[i] % 2 == 0) {
            	par++;
            	pares[par-1] = numeros[i];
            	somaPar += numeros[i];
            } else {
            	impar++;
            	impares[impar-1] = numeros[i];
            	somaImpar += numeros[i];
            }
        }
        System.out.println("Houve "+par+" números pares digitados");
        for (int i = 0; i < numeros.length; i++) {
        	if (pares[i] != 1) {
        		System.out.println("pares["+i+"] = "+pares[i]);
        	}
        }
        System.out.println("A soma dos números pares foi de: "+somaPar);
        System.out.println("Houve "+impar+" números ímpares digitados");
        for (int i = 0; i < numeros.length; i++) {
        	if (impares[i] != 0) {
        		System.out.println("impares["+i+"] = "+impares[i]);
        	}
        }
        System.out.println("A soma dos números ímpares foi de: "+somaImpar);
        
        ler.close();
	}
}
