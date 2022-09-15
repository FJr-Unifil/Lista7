package lista7;

import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int linhas;
		int i = 0;
		int j = 0;
		String aux = "";
		String pascalSemEspacos;
		int aux2 = 0;
		int numeroDeAdicao;
		System.out.println("Digite o número de linhas desejado de triângulo de pascal: ");
		linhas = ler.nextInt();
		String trianguloPascal[][] = new String[linhas][1];
		for (i = 0; i < linhas; i++) {
			if (i == 0) {
				trianguloPascal[0][0] = "1";
			} else if (i == 1) {
				trianguloPascal[1][0] = "1 1";
			} else {
				trianguloPascal[i][0] = "";
				numeroDeAdicao = i - 1;
				for (j = 0; j < i+1; j++) {
					if (j == 0 || j == i) {
						trianguloPascal[i][0] += "1";
						if (j == i) {
							System.out.println();
						}
					} else {
						char teste[] = new char[i-1];
						pascalSemEspacos = trianguloPascal[i - 1][0].replaceAll("\\D", "");
						teste = pascalSemEspacos.toCharArray();
							aux2=0;
							for (int k = j - 1; k < i+1;) {
								aux2 = Character.getNumericValue(teste[k]) + Character.getNumericValue(teste[j]);
								trianguloPascal[i][0] += Integer.toString(aux2);
								break;
						}
						
					}
				}
			}
		}
		for (i = 0; i < trianguloPascal.length; i++) {
			System.out.println(trianguloPascal[i][0]);
		}
		ler.close();
	}
}
