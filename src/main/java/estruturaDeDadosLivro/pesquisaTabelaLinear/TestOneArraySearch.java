package estruturaDeDadosLivro.pesquisaTabelaLinear;

public class TestOneArraySearch {
    /*
    digite 70 que deseja pesquisar e depois retorne o índice
     */

    public static int search(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {90, 70, 50, 80, 60, 95};

        int index = search(array, 70);

        System.out.print("Fount value: 70 the index is" + index);
    }
}
