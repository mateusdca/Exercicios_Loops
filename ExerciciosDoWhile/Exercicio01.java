package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;

      do {
        System.out.println("Escreva um número de 1 a 100: ");
        n = sc.nextInt();
        
      } while (n < 1 || n > 100);
      
      sc.close();
      System.out.println(n);
    }
}
