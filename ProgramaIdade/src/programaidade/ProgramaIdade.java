package programaidade;

import java.util.Scanner;


public class ProgramaIdade {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual seu ano de nascimento? ");
        int nasc = scanner.nextInt();
        
        int idade = 2026 - nasc;
        System.out.println("Sua idade é " + idade);
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
    
}
