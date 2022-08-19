package p1.sort.fQuickSort;

/*
QUICK SORT
        Custo e complexidade:O(n log n)
        Não tem boa performance

 */
public class Main {

    public static void main(String[] args) {

        int [] vetor = new int[5];

        System.out.println("Desordenado");
        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }

        quicksort(vetor,0,vetor.length-1);

        System.out.println("\n\nOrdenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }

    static void quicksort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int p = particao(vetor,esquerda,direita);
            quicksort(vetor,esquerda,p);
            quicksort(vetor,p+1,direita);
        }
    }

    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int)(esquerda + direita)/2;
        int pivot = vetor[meio];

        int i = esquerda - 1;
        int j = direita + 1;

        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if(i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            System.out.println();
            for(int k=0;k<vetor.length;k++){

                System.out.print(vetor[k] + " ");
            }
        }
    }
}
