package ExerciciosFor;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long fatorial = 1;
    int n;
   
    while (true) {
      System.out.println("Digite um número inteiro positivo:");
      
      
      if (scanner.hasNextInt()) {
          n = scanner.nextInt();

          
          if (n >= 0) {
              break; 
          } else {
              System.out.println("O número deve ser positivo!");
          }

      } else {
          
          System.out.println("Valor inválido! Digite um número inteiro.");
          scanner.next(); 
      }
  }

    

    for (int i = 1; i <= n; i++) {
      fatorial *= i;


    }
    System.out.println("O fatorial de " + n + " é: " + fatorial);
    scanner.close();
  }
  
}
