package grafos;

public class Aresta<TIPO> {
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(Double peso, Vertice<TIPO> inicio, Vertice<TIPO> fim){
        //this peso referece a atributos da classe
        //peso se refere as variaveis do construtor
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double peso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Vertice<TIPO> inicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> fim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}
