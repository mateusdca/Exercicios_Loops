package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float SomaNotas = 0, Nota, NotaFinal;
    int NumeroNotas = 0;
    char SouN;

    do {
      System.out.println("Adicione a nota do aluno:");
      Nota = sc.nextFloat();
      sc.nextLine();
      if (Nota >= 0 && Nota <= 10) {
        SomaNotas += Nota;
        NumeroNotas++;
        
      }else{
        System.out.println("Nota invalida!");
      }

      System.out.println("Deseja inserir outra nota? (s/n)");
      SouN = sc.next().toLowerCase().charAt(0);
      
      
    } while (SouN != 'n' );
    
    if(NumeroNotas >= 0){
      NotaFinal = SomaNotas/NumeroNotas;
      System.out.printf("A média do aluno é: %.2f",NotaFinal);
    }else{
      System.out.println("Nenhuma nota válida adicionada!");
    }
    sc.close();
  }
  
}
