package p1.eSelectionSort;

/*
SELECTION SORT
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

        int posic_menor, aux;
        for(int i=0; i<vetor.length; i++){
             posic_menor = i;

            for(int j=i+1; j<vetor.length; j++){

                if(vetor[j] < vetor[posic_menor]){
                    posic_menor = j;
                }

            }
            aux = vetor[i];
            vetor[i] = vetor[posic_menor];
            vetor[posic_menor] = aux;

        }

        System.out.println("\n\nOrdenado");
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

    }

}
