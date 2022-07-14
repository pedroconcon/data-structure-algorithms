package p1.hBinaryTree;


class No {
    public long item;
    public No dir;
    public No esq;
}

class Tree {
    private No root; // raiz

    public Tree() { root=null; } // inicializa arvore

    public void inserir(long v) {
        No novo = new No(); // cria um novo Nó
        novo.item = v; // atribui o valor recebido ao item de dados do Nó
        novo.dir = null;
        novo.esq = null;

        if (root == null) root = novo;
        else  { // se nao for a raiz
            No atual = root;
            No anterior;
            while(true) {
                anterior = atual;
                if (v <= atual.item) { // ir para esquerda
                    atual = atual.esq;
                    if (atual == null) {
                        anterior.esq = novo;
                        return;
                    }
                }  // fim da condição ir a esquerda
                else { // ir para direita
                    atual = atual.dir;
                    if (atual == null) {
                        anterior.dir = novo;
                        return;
                    }
                } // fim da condição ir a direita
            } // fim do laço while
        } // fim do else não raiz

    }

    public No buscar(long chave) {
        if (root == null) return null; // se arvore vazia
        No atual = root;  // começa a procurar desde raiz
        while (atual.item != chave) { // enquanto nao encontrou
            if(chave < atual.item ) atual = atual.esq; // caminha para esquerda
            else atual = atual.dir; // caminha para direita
            if (atual == null) return null; // encontrou uma folha -> sai
        } // fim laço while
        return atual; // terminou o laço while e chegou aqui é pq encontrou item
    }

    public void inOrder(No atual) {
        if (atual != null) {
            inOrder(atual.esq);
            System.out.print(atual.item + " ");
            inOrder(atual.dir);
        }
    }

    public void preOrder(No atual) {
        if (atual != null) {
            System.out.print(atual.item + " ");
            preOrder(atual.esq);
            preOrder(atual.dir);
        }
    }

    public void posOrder(No atual) {
        if (atual != null) {
            posOrder(atual.esq);
            posOrder(atual.dir);
            System.out.print(atual.item + " ");
        }
    }

}


