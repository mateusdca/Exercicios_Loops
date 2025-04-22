package Exercicios;

public class Exercicio04 {
  
    public static void main(String[] args) {
      int i = 0;
      int a = 0;
      int b = 1;

      while (i < 10) {
          System.out.println(a);
          int n = a + b;
          a = b;
          b = n;

          i++;
      }
    }
}

