package lista7;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String primeiroVetor[] = new String[3];
		String segundoVetor[] = new String[3];
		char point = '.';
		int contadorDePontos = 0;
		int contadorDeNumerosNaoRepetidos = 0;
		boolean prosseguir = false;
		int indiceVetoresString = 0, indiceVetorFinal = 0;
		
		/* Aqui eu carrego o primeiroVetor e so passa pra carregar outro numero caso tenha certeza que e um numero.
		 * Optei por usar string pois assim garanto que o usuário posa por qualquer número. 
		 * Vale lembrar que utilizei uma variavel para saber o tamanho do vetor3 (contadorDeNumerosNaoRepetidos), a cada numero nao repetido */
		for (int i = 0; i < primeiroVetor.length; i++) {
			contadorDePontos = 0;
			do {
				System.out.println("Digite o " + (i + 1) + "º número do 1º vetor:");
				primeiroVetor[i] = ler.next();
				primeiroVetor[i] = primeiroVetor[i].replaceAll(",", ".");
				char aux[] = new char[primeiroVetor[i].length()];
				aux = primeiroVetor[i].toCharArray();
				for (int j = 0; j < aux.length; j++) {
					if (Character.isDigit(aux[j]) || aux[j] == point) {
						prosseguir = true;
						if (aux[j] == point) {
							contadorDePontos++;
						}
					} else {
						prosseguir = false;
						break;
					}
					if (contadorDePontos > 1) {
						prosseguir = false;
						break;
					}
				}
			} while (prosseguir == false);
		}
		/* Aqui checo se ha numeros repetidos. Se houver eu deixo o primeiro numero e troco o que vem depois por "repetido" */
		for (int i = 0; i < primeiroVetor.length; i++) {
			for (int j = i + 1; j < primeiroVetor.length; j++) {
				if (primeiroVetor[i].equals(primeiroVetor[j]) && !primeiroVetor[i].equals("repetido")) {
					primeiroVetor[j] = "repetido";
				} else {
					contadorDeNumerosNaoRepetidos++;
				}
			}
		}

		prosseguir = false;

		/* Aqui faco o mesmo processo, so que com o segundo vetor */
		for (int i = 0; i < segundoVetor.length; i++) {
			contadorDePontos = 0;
			do {
				System.out.println("Digite o " + (i + 1) + "º número do 2º vetor:");
				segundoVetor[i] = ler.next();
				segundoVetor[i] = segundoVetor[i].replaceAll(",", ".");
				char aux[] = new char[segundoVetor[i].length()];
				aux = segundoVetor[i].toCharArray();
				for (int j = 0; j < aux.length; j++) {
					if (Character.isDigit(aux[j]) || aux[j] == point) {
						prosseguir = true;
						if (aux[j] == point) {
							contadorDePontos++;
						}
					} else {
						prosseguir = false;
						break;
					}
					if (contadorDePontos > 1) {
						prosseguir = false;
						break;
					}
				}
			} while (prosseguir == false);
		}

		for (int i = 0; i < segundoVetor.length; i++) {
			for (int j = i + 1; j < segundoVetor.length; j++) {
				if (segundoVetor[i].equals(segundoVetor[j]) && !segundoVetor[i].equals("repetido")) {
					segundoVetor[j] = "repetido";
				} else {
					contadorDeNumerosNaoRepetidos++;
				}
			}
		}

		/* Aqui uso dois for para navegar entre os dois vetores, se houver numero repetido entre eles, o que esta no primeiroVeotr fica salvo e o do 
		 * segundo descarto como "repetido".
		 * Nesse caso o contadorDeNumerosNaoRepetidos sera subtraido a cada numero repetido encontrado. Pois eu contei os numeros em cada vetor,
		 * porem se houver repetido entre eles, precisarei subtrair para ficar com o valor exato. */
		for (int i = 0; i < primeiroVetor.length; i++) {
			for (int j = 0; j < segundoVetor.length; j++) {
				if (primeiroVetor[i].equals(segundoVetor[j]) && !primeiroVetor[i].equals("repetido")) {
					contadorDeNumerosNaoRepetidos--;
					segundoVetor[j] = "repetido";
					break;
				}
			}
		}
		prosseguir = false;
		float vetorFinal[] = new float[contadorDeNumerosNaoRepetidos];
		
		/* Aqui e onde carrego o vetorFinal, aproveitei para escrever aqui tambem, mas se quiser deixar o codigo mais limpo, pode deixar para escrever 
		 * em um for diferente. */
		do {
			if (indiceVetoresString < 3 && indiceVetorFinal < contadorDeNumerosNaoRepetidos + 1) {
				if (primeiroVetor[indiceVetoresString].equals("repetido") && segundoVetor[indiceVetoresString].equals("repetido")) {
					indiceVetoresString++;
				} else if (!primeiroVetor[indiceVetoresString].equals("repetido") && !segundoVetor[indiceVetoresString].equals("repetido")) {
					vetorFinal[indiceVetorFinal] = Float.parseFloat(primeiroVetor[indiceVetoresString]);
					System.out.println("vetorFinal[" + indiceVetorFinal + "] = " + vetorFinal[indiceVetorFinal]);
					indiceVetorFinal++;
					vetorFinal[indiceVetorFinal] = Float.parseFloat(segundoVetor[indiceVetoresString]);
					System.out.println("vetorFinal[" + indiceVetorFinal + "] = " + vetorFinal[indiceVetorFinal]);
					indiceVetorFinal++;
					indiceVetoresString++;
				} else if (!primeiroVetor[indiceVetoresString].equals("repetido") && segundoVetor[indiceVetoresString].equals("repetido")) {
					vetorFinal[indiceVetorFinal] = Float.parseFloat(primeiroVetor[indiceVetoresString]);
					System.out.println("vetorFinal[" + indiceVetorFinal + "] = " + vetorFinal[indiceVetorFinal]);
					indiceVetorFinal++;
					indiceVetoresString++;
				} else if (!segundoVetor[indiceVetoresString].equals("repetido") && primeiroVetor[indiceVetoresString].equals("repetido")) {
					vetorFinal[indiceVetorFinal] = Float.parseFloat(segundoVetor[indiceVetoresString]);
					System.out.println("vetorFinal[" + indiceVetorFinal + "] = " + vetorFinal[indiceVetorFinal]);
					indiceVetorFinal++;
					indiceVetoresString++;
				}
			}
		} while (indiceVetorFinal != vetorFinal.length);
		ler.close();
	}
}
