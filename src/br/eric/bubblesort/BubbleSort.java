package br.eric.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] vetorBubble = { 8, 2, 10, 1, 5, 3, 20, 12, 4 };

		System.out.println("Ordenado pelo BUBBLESORT:\n");
		bubbleSort(vetorBubble);

		for (int i = 0; i < vetorBubble.length; i++) {
			System.out.println(vetorBubble[i]);
		}
	}
	
	private static void bubbleSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				if (v[i] < v[j]) {
					int troca = v[i];
					v[i] = v[j];
					v[j] = troca;
				}
			}
		}

	}

}
