package recursivaFuncaoExercicios.pilha;

public class Pilha{
    private int[] stack;
    private int topo;
    private int capacidade;

    //construtos
    public Pilha(int tamanho){
        stack = new int[tamanho];
        capacidade = tamanho;
        topo = -1; //pilha inicialmente vazia
    }

    //método para adicionar um elemento (push)
    /*public void push(int valor){
        if(isFull()){
            System.out.println("A pilha esta cheia. Não é possivel adicionar " + valor);
            return;
        }
        stack[++topo] = valor;
    } */

    //métopo para adicionar um elemento (push)
    public void push(int valor){
        if(isFull()){
            System.out.println("A pilha esta cheia. Não é possivel adiocnar" + valor);
            return;
        }
        stack[++topo] = valor;
    }

    //métopo para remover o elemento do topo (pop)
    public int pop(){
        if(isEmpty()){
            System.out.println("A pilha esta vazia. Não é possivel remover elementos");
            return -1;
        }
        return stack[topo--];
    }

    //método para retornar o elemento no topo sem removê-lo (pee)
    public int peek(){
        if(isEmpty()){
            return stack[topo];
        }
        System.out.println("A pilha esta vazia");
        return -1;
    }

    //verifica se a pilha esta cheia
    public boolean isFull(){
        return topo == capacidade -1;
    }

    //método poara verificar se apilha esta vazia
    public boolean isEmpty(){
        return topo == -1;
    }

    //métopo para obter o tamanho atual da pilha
    public int tamanho(){
        return topo +1;
    }
}
