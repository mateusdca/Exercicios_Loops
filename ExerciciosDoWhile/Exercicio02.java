package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do {

      System.out.println("1. Adicionar");
      System.out.println("2. Remover");
      System.out.println("3. Sair");
      System.out.println("Escolha uma das opções(escreva apenas o número): ");
      
      n = sc.nextInt();

      switch (n) {
        case 1:
            System.out.println("Item adicionado com sucesso!");
            break;
        case 2:
            System.out.println("Item removido com sucesso!");
            break;
        case 3:
            System.out.println("Saindo do programa...");
            break;
        default:
            System.out.println("Opção inválida! Tente novamente.");
      }
    
    }while (n != 3);
    sc.close();
    System.out.println("Programa encerrado.");
  } 
}
