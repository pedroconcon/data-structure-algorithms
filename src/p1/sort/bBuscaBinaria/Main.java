package p1.sort.bBuscaBinaria;

import java.util.Scanner;

/*
BINARY SEARCH/ BUSCA BINARIA
    Custo e complexidade: O(log n)
    Pior caso: numero que não existe, ou numero das pontas;

    O conceito de busca binaria é dividir o array pela metade até a posição inicial ser igual a final,
    quando isso ocorrer é porque foi encontrado o elemento na busca

    Para fazer a busca binaria o vetor precisa estar ordenado;
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[100];

        for(int i=0;i< vetor.length;i++){
            vetor[i] = i * 2;
        }

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        System.out.println("Qual numero voce busca?");
        int buscado = Integer.valueOf(scanner.nextLine());

        while(inicio <= fim){
            meio = (int) ((inicio + fim)/2);
            contador ++;
            if(vetor[meio] == buscado) {
                achou = true;
                break;
            }else if(vetor[meio] < buscado){
                inicio = meio + 1;

            }else{
                fim = meio - 1;
            }
        }

        if(achou){
            System.out.println("Quantidade de testes" + contador);
            System.out.println("Achou");
        }else{
            System.out.println("Quantidade de testes" + contador);
            System.out.println("Nao achou");
        }

    }
}









