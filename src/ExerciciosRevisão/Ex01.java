package ExerciciosRevisão;

import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //entrada de dados
        System.out.println("Informe o total de vendas: ");
        double totalVendas = sc.nextDouble();
        //processamento
        double comissao = totalVendas * 0.1;
        //saída
        System.out.println("O valor da Comissão é: "+comissao);
    }
}
