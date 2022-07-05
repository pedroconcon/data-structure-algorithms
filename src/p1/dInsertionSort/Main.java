package p1.dInsertionSort;

/*
INSERTION SORT
    Custo e complexidade:O(N²)
    Não tem boa performance

 */
public class Main {

    public static void main(String[] args) {
        int [] vetor = new int[10];

        System.out.println("Desordenado");
        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int aux;

        for(int i=1;i < vetor.length;i++){
            aux = vetor[i];
            int j = i - 1;

            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        System.out.println("\n\nOrdenado");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

    }
}
