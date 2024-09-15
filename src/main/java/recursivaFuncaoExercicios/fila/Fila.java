package recursivaFuncaoExercicios.fila;

public class Fila {
    /*
    2. Implementação de Fila (Queue)
       Implemente uma fila usando arrays ou listas.
       Inclua operações como enqueue(), dequeue(), e métodos para verificar se a fila está cheia ou vazia.
       Teste com diferentes cenários, incluindo filas circulares.
     */
    private int[] fila;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    //constutro da fila
    public void Fila(int capacidade){
        this.capacidade = capacidade;
        fila = new int[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    //método para adicionar um elemento da fila(enqueeu)
    public void enqueue(int elemento){
        if(filaCheia()){
            System.out.println("Fila cheia! Não é possíve adicionar o elemento");
        }else{
            fim = (fim + 1) % capacidade; //fila circular
            fila[fim] = elemento;
            tamanho++;
        }
    }
    //método para remover um elemento da fila
    public int dequeue(){
        if(filaVazia()){
            System.out.println("Fila vazia! Não é possivel remover elementos.");
            return -1;
        } else{
            int elementoRemovido = fila[inicio];
            inicio = (inicio + 1) % capacidade; //fila circular
            tamanho--;
            return elementoRemovido;
        }
    }

    //métod para informar se a fila esta vazia
    public boolean filaVazia(){
        return tamanho == 0;
    }

    //método para informar se a fila esta cheia
    public boolean filaCheia(){
        return tamanho == capacidade;
    }

    //métod para retornar o tamanho atual da fila
    public int getTamanho(){
        return tamanho;
    }

    //método para ver o primeiro elemento da fila sem remover
    public int peek(){
        if(filaVazia()){
            System.out.println("Fila vazia! Não há elementos");
            return -1; //ou lançar uma e
        } else {
            return fila[inicio];
        }
    }

    //método para exibir os elementos da fila
    public void exibirFila(){
        if(filaVazia()){
            System.out.println("Fila está vazia");
        }else{
            System.out.println("Fila: ");
            for(int i = 0; i < tamanho; i++){
                System.out.println(fila[(inicio + i) % capacidade] + " ");
            }
            System.out.println();
        }
    }
}
