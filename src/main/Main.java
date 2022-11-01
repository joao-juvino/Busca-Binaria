package main;

/**
 * Método de busca binária, utilizado em um array ordenado. Esse método possui
 * um tempo de log(n).
 */
public class Main {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("TESTES: BUSCA BINÁRIA");

		System.out.println(formataSaida(4, (buscaBinaria(4, array, 0, array.length - 1))));
		System.out.println(formataSaida(14, (buscaBinaria(14, array, 0, array.length - 1))));
		System.out.println(formataSaida(0, (buscaBinaria(0, array, 0, array.length - 1))));
		System.out.println(formataSaida(-4, (buscaBinaria(-4, array, 0, array.length - 1))));
	}

	public static String formataSaida(int valor, boolean estaPresente) {
		if (estaPresente)
			return "O valor " + valor + " está presente do array";
		else
			return "O valor " + valor + " não está presente do array";
	}

	/**
	 * Implementação da busca binária
	 * 
	 * @param valor: o valor a ser buscado
	 * @param array: o array em que o valor será buscado
	 * @param leftIndex: o index que limita o array à esquerda
	 * @param rightIndex: o index que limita o array à direita
	 * 
	 * @return true/false: valor booleano que indica se o valor está presente no array
	 */
	public static boolean buscaBinaria(int valor, int[] array, int leftIndex, int rightIndex) {
		// Encontra o valor central do array
		int middle = (rightIndex + leftIndex) / 2;

		// Caso base do método recursivo
		if (leftIndex > rightIndex)
			return false;

		// Verificando se o valor foi encontrado
		if (valor == array[middle])
			return true;

		// Refaz a busca com o array reduzido
		if (valor < array[middle])
			return buscaBinaria(valor, array, leftIndex, middle - 1);
		else
			return buscaBinaria(valor, array, middle + 1, rightIndex);
	}

}
