package javaEstruturaDeDados.vetor;
import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[0] = "BA";
        estados[0] = "CE";
        estados[0] = "DF";
        estados[0] = "AM";
        estados[0] = "AP";
        estados[0] = "RN";
        estados[0] = "MS";
        estados[0] = "SP";

        for(int i = 0; i < estados.length; i++){
            System.out.println("Estados " + i + ": " + estados[i]);
        }
        System.out.println("Qual a sigla de estado vocÊ deseja buscar? ");
        String siglaBusca = scan.nextLine();

        //busca linear
        boolean encontrou = false;
        for(int i =0; i < estados.length; i++){
            String elemento = estados[i];
            if(elemento.equals(siglaBusca)){
               encontrou = true;
               break;
            }
        }
        if(encontrou == true){
            System.out.println("Encontrou");
        }else{
            System.out.println("Não encontrou");
        }



    }
}
