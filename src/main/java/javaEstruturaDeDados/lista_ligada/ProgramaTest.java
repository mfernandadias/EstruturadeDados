package javaEstruturaDeDados.lista_ligada;

public class ProgramaTest {
    public static void main(String[] args){

        ListaLigada lista = new ListaLigada();
        lista.adiciona("AC");
        lista.adiciona("BA");
        lista.adiciona("CE");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getprimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        System.out.println();
    }
}
