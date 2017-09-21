package br.eric.selection;

public class SelectionSort {

	public static void main(String[] args) {

		int[] vetorSelection = { 8, 2, 10, 1, 5, 3, 20, 12, 4};
		
		System.out.println("Ordenado pelo SELECTIONSORT:\n");
		selectionSort(vetorSelection);
		
		for (int i = 0; i < vetorSelection.length; i++) {
			System.out.println(vetorSelection[i]);
		}
	}

	private static void selectionSort(int[] v) {
		for (int fixo = 0; fixo < v.length-1; fixo++) {
			int menor = fixo;
			
			for (int i = menor + 1; i < v.length; i++) {
				if(v[i] < v[menor]){
					menor = i;
				}
			}
			
			if(menor != fixo){
				int troca = v[fixo];
				v[fixo] = v[menor];
				v[menor] = troca;
			}
		}
		
	}
}
