package br.eric.quicksort;

public class QuickSort {

	public static void main(String[] args) {

		int[] vetorQuickSort = { 8, 2, 10, 1, 5, 3, 20, 12, 4 };

		System.out.println("Ordenado pelo QUICKSORT:\n");
		//quickSort(vetorQuickSort, 0, vetorQuickSort.length - 1);
		quickSortDois(vetorQuickSort, 0, vetorQuickSort.length - 1);

		for (int i = 0; i < vetorQuickSort.length; i++) {
			System.out.println(vetorQuickSort[i]);
		}

	}
	
	//QuickSort DOIS
	private static void quickSortDois(int[] v, int inicio, int fim) {
		if(inicio < fim){
			int posPivo = separar(v, inicio, fim);
			quickSortDois(v, inicio, posPivo-1);
			quickSortDois(v, posPivo+1, fim);
		}
	}

	//Separa o vetor e retorna a posição do pivo
	private static int separar(int[] v, int inicio, int fim) {
		int pivo = v[inicio];
		int esq = inicio+1;
		int dir = fim;
		int troca;
		
		while(esq <= dir){
			if(v[esq] <= pivo)esq++;
			else if(pivo < v[dir])dir--;
			else{
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq++;
				dir--;
			}
		}
		
		v[inicio] = v[dir];
		v[dir] = pivo;
		
		return dir;
	}

	// QuickSort UM
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
