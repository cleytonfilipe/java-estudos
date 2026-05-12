package programamedia;

import java.util.Scanner;


public class ProgramaMedia {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Primeira nota: ");
        float n1 = scanner.nextFloat();
        
        System.out.println("Segunda nota: ");
        float n2 = scanner.nextFloat();
        
        float m = (n1 + n2)/2;
        System.out.println("Sua média foi " + m);
        
        if (m>9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
    }
    
}
