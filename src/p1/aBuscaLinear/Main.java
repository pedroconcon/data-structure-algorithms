package p1.aBuscaLinear;

import java.util.Scanner;

/*
LINEAR SEARCH/BUSCA LINEAR
    Custo e Complexidade: O(N)

    O custo desse algoritmo de busca linear depende da quantidade de N.

    A quantidade de passos depende do tamanho do vetor, então quanto maior o vetor
    maior o tempo de busca.
 */
public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[8];

        for(int i=0;i< vetor.length;i++){
            vetor[i] = (int)(Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual numero voce busca?");
        Scanner scanner = new Scanner(System.in);

        int buscado = Integer.valueOf(scanner.nextLine());

        boolean achou = false;
        for(int i = 0; i<vetor.length;i++){
            if(vetor[i] == buscado){
                achou = true;
                break;
            }
        }

        if(achou){
            System.out.println("Achou!");
        }else{
            System.out.println("Nao achou!");
        }
    }
}
