package grafos;
import java.util.ArrayList

public class Grafo<TIPO> {
    //grafo é composto de vertices e arestas

    private ArrayList<TIPO> vertices;
    private ArrayList<TIPO> arestas;

    public Grafo(){
        this.vertices = new ArrayList<TIPO>();
        this.arestas = new ArrayList<TIPO>();
    }

    public void adicionaVertice(TIPO dado){

    }

    public void adicionaAresta(Double peso, TIPO inicio, TIPO fim){

    }

}
