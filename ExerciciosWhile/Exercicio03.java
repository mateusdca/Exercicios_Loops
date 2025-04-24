package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Senha =  "1234";
        String SenhaDigitada;

        System.out.println("Digite sua senha: ");
        SenhaDigitada = sc.nextLine();

        while (!SenhaDigitada.equals(Senha)){
            System.out.println("Senha incorreta, tente novamente.");
            System.out.println("Digite sua senha: ");
            SenhaDigitada = sc.nextLine();
        }

        System.out.println("Acesso concedido");
        sc.close();


    }
  
}
