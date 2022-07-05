package p1.cBubbleSort;
/*
BUBBLE SORT
    Custo e complexidade:O(N²)
    Não tem boa performance
 */
public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[10000];

        for(int i=0;i< vetor.length;i++){
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        long inicio = System.currentTimeMillis();

        for(int i=0;i<vetor.length;i++){
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[i] > vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo = " + (fim-inicio));
        /*
        System.out.println("Vetor ordenado:");
        for (int i=0;i<vetor.length;i++) {
            System.out.println(vetor[i]);
        }*/

    }
}
