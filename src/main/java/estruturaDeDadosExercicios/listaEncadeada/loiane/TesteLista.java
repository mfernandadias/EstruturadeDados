package estruturaDeDadosExercicios.listaEncadeada.loiane;

public class TesteLista {
    public static void main(String[] args){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adiciona(1);

        System.out.println(lista);

        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println(lista);
    }
}
