package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite o número positivo a ser somado: ");
        int n = sc.nextInt();

        while (n > 0) {
            soma += n;
            System.out.println("Digite o número positivo a ser somado: ");
            n = sc.nextInt();
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();


    }
  
}
