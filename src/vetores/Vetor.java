package vetores;

import java.util.Scanner;

public class Vetor {
    public static void main (String[] args){
        int[] notas = new int[4];

        for(int i = 0; i < notas.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre com a "+(i+1)+"° nota: ");
            notas[i] = sc.nextInt();

        }
        for(int i = 0;i < notas.length;i++){
            System.out.println(notas[i]);
        }
    }
}