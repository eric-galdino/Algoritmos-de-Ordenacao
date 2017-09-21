package br.eric.quicksort;

public class QuickSort {

	public static void main(String[] args) {

		int[] vetorQuickSort = { 8, 2, 10, 1, 5, 3, 20, 12, 4 };

		System.out.println("Ordenado pelo QUICKSORT:\n");
		quickSort(vetorQuickSort, 0, vetorQuickSort.length - 1);

		for (int i = 0; i < vetorQuickSort.length; i++) {
			System.out.println(vetorQuickSort[i]);
		}

	}
	
	// QuickSort Recursivo
	private static void quickSort(int[] v, int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;

		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq++;
			}
			while (v[dir] > pivo) {
				dir--;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq++;
				dir--;
			}
		}

		if (dir > esquerda) {
			quickSort(v, esquerda, dir);
		}
		if (esq < direita) {
			quickSort(v, esq, direita);
		}
	}

}
