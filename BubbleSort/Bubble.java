package BubbleSort;

public class Bubble {
  public static void main(String[] args) {
    int[] vetor = {5, 2, 1, 6};

    for (int i = 0; i < vetor.length; i++) {
        for (int j = 0; j < vetor.length - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int temp     = vetor[j];
                vetor[j]     = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
    }

    for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i]);
    }

  }
}
