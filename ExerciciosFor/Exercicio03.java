package ExerciciosFor;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    int[] numeros = new int [10];
    int soma = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite o " + (i + 1) + " número:");
      numeros[i] = sc.nextInt();
      soma += numeros[i];
    }
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);

    }
    
    System.out.println("A soma dos números é: " + soma);
    sc.close();
  }
}  