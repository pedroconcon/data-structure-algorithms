package p1.hBinaryTree;

public class Arvore<TIPO extends Comparable>{
    private Elemento<TIPO> raiz;

    public Arvore(){
        this.raiz = null;
    }

    public void adicionar(TIPO valor){
       Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);

        if(raiz == null){
            this.raiz = novoElemento;
        }else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1){
                    if(atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{
                    if(atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public Elemento<TIPO> getRaiz() {
        return raiz;
    }

    public void emOrdem(Elemento<TIPO> atual){

        if(atual != null){
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }
    public void preOrdem(Elemento<TIPO> atual) {

        if(atual != null){
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(Elemento<TIPO> atual) {

        if(atual != null){
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

    public boolean remover(TIPO valor){
        //buscar elemento na arvore

        Elemento<TIPO> atual = this.raiz;
        Elemento<TIPO> paiAtual = null;

        while(atual != null){
            if(atual.getValor().equals(valor)){
                break;
            }else if(valor.compareTo(atual.getValor()) == -1){ //valor procurado é menor que o atual
                paiAtual = atual;
                atual = atual.getEsquerda();
            }else{
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }

        if(atual != null){

            if(atual.getDireita() != null && atual.getEsquerda() != null){

            }else if(atual.getDireita() != null){

            }else if(atual.getEsquerda() != null){

            }else{
                if(atual.getValor().compareTo(paiAtual.getValor()) == -1){//atual < paiAtual
                    paiAtual.setEsquerda(null);
                }else{
                    paiAtual.setDireita(null);
                }
            }
            return true;
        }else{
            return false;
        }

    }
}
