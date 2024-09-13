package javaEstruturaDeDados.lista_ligada;

public class Elemento {
    private String valor;
    private Elemento proximo;


    public Elemento(String novoValor){
        this.valor = novoValor;
    }

    public Elemento getproximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String getvalor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
