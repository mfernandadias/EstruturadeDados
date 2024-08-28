package estruturaDeDados;

import static java.util.Arrays.sort;

public class TestBubbleSort {
    /*

     */
    public static void main(String[] args){
        int[] scores = {60, 50, 95, 80, 70};

        sort(scores);

        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " , ");
        }
    }

    public static void sort(int[] arrays){
        for(int i = 0; i < arrays.length; i++){
            boolean isSwap = false;
            for(int j = 0; j < arrays.length - i -1; j++){
                if(arrays[j] > arrays[j + 1]){ //permutar
                    int temp = arrays[j];
                    arrays[j] = arrays[j+ 1];
                    arrays[j + 1] = temp;
                    isSwap = true;
                }
            }

            if(!isSwap) //nenhuma troca, então encerre a ordenar
            {
                break;
            }
        }
    }
}
