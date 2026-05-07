package exerciciooperadoresaritmeticos1;

import java.util.Scanner;

public class ExercicioOperadoresAritmeticos1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                           Gênio: Estou pensando em um número entre 1 e 5.
                           Tente adivinhar este número.""");
        System.out.println("Qual seu palpite? ");
        int palpite = scanner.nextInt();
        
        double valor = Math.random();
        int numero = 1 + (int)(valor * 5);
        
        if (palpite < 1 || palpite > 5) {
            System.out.println("Lembre-se que o palpite deve ser de 1 à 5.");
        } else if (palpite == numero) {
            System.out.println("Nossa! Você é mesmo muito bom! Adivinhou que pensei no número " + numero);
        } else {
            System.out.println("Que pena... Você errou. Pensei no número " + numero);
        }
        scanner.close();
        
    } 
    
}
