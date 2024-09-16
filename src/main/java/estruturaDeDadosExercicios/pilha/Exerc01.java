package estruturaDeDadosExercicios.pilha;


public class Exerc01 {
    /*
    1. Implementação de Pilha (Stack)
       Implemente uma pilha usando arrays.
       Adicione operações como push(), pop(), peek(), e verifique se a pilha está vazia ou cheia.
       Teste a implementação com uma classe de teste, criando e manipulando a pilha.
     */
    public static void main(String[] args){

        //Pilha[] pilha = new Pilha[5]; //crie  uma pilha com capacidade de 5 elementos
        Pilha pilha = new Pilha(5);

        //testando a operação push
        pilha.push(10);
        pilha.push(8);
        pilha.push(9);
        pilha.push(11);
        pilha.push(7);
        pilha.push(5);

        //exibindo o elemento do topo usando peek
        System.out.println("Elemento no topo da pilha: " + pilha.peek());


        //removendo elementos usando pop
        System.out.println("Elemento removido: " + pilha.pop());

        //verificando o novo topo da pilha
        System.out.println("Novo elemento no topo da pilha: " + pilha.peek());

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        // Esvaziando a pilha
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }

}
