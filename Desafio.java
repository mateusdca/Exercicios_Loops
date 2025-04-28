import java.util.Scanner;
public class Desafio {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char SouN;
    float P, r, MontanteC, MontanteS;
    int t, Rendimento;

    System.out.println("CALCULADORA DE RENDIMENTO DE APLICAÇÃO FINANCEIRA");
    
    
    do { // Loop até o usuário decidir parar

      
      while (true) { // Loop infinito para garantir a entrada correta.
      System.out.println("Escolha o tipo de rendimento: ");
      System.out.println("1 - Simples");
      System.out.println("2 - Composto");
      Rendimento = sc.nextInt();
        if (Rendimento == 1) {
          System.out.println("Informe o valor do investimento inicial:");
          P = sc.nextFloat();
          System.out.println("Informe a taxa de juros anual em %: ");
          r = sc.nextFloat();
          System.out.println("Informe o tempo em anos: ");
          t = sc.nextInt();
          MontanteS = P * (1 + (r / 100) * t);
          System.out.printf("O rendimento final é: R$%.2f%n", MontanteS);
          break;
        } else if (Rendimento == 2) {
          System.out.println("Informe o valor do investimento inicial:");
          P = sc.nextFloat();
          System.out.println("Informe a taxa de juros anual em %: ");
          r = sc.nextFloat();
          System.out.println("Informe o tempo em anos: ");
          t = sc.nextInt();
          MontanteC = P * (float) Math.pow((1 + (r / 100)), t);
          System.out.printf("O rendimento final é: R$%.2f%n", MontanteC);
          break;
        } else {
          System.out.println("Opção inválida! Tente novamente.");
        }
      }

      System.out.println("Deseja realizar um novo cálculo. (s/n)");
      SouN = sc.next().toLowerCase().charAt(0);
      
      
    } while (SouN != 'n' );
    
    System.out.println("Desligando o calculadora...");

    sc.close();
  }
  
}
