package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tentativa;
    int aleatorio = (int)(Math.random()*20) + 1;

    System.out.println("Descubra o numero de 1 a 20");
    do {
      System.out.println("Digite um numero de 1 a 20(ou 0 para desistir):");
      tentativa = sc.nextInt();
      if (tentativa == 0){
        System.out.println("Você desistiu!");
      }else if (tentativa == aleatorio) {
        System.out.println("Parabéns!!! Você acertou!");
      }else if (tentativa < aleatorio) {
        System.out.println("Você errou! O numero é maior, tente novamente.");
      }else { 
        System.out.println("Você errou! O numero é menor, tente novamente.");
      }

    } while (tentativa != aleatorio && tentativa != 0);
    
    System.out.println("O numero era: " + aleatorio);
    sc.close();
  }
}
