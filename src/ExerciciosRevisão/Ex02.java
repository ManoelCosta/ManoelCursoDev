package ExerciciosRevisão;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        int totalFolha;
        double resultado;
        Scanner sc = new Scanner(System.in);
        totalFolha = sc.nextInt();
        if (totalFolha <= 100){
            resultado = totalFolha * 0.25;
        }else{
            resultado = totalFolha * 0.20;
        }
        System.out.println(resultado);
    }
}
