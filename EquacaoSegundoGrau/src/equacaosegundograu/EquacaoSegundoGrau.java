package equacaosegundograu;

import java.util.Scanner;

public class EquacaoSegundoGrau {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vamos calcular a equação de segundo grau Ax\u00B2+Bx+C=0");
        System.out.println("\u0394 = B\u00B2-4.A.C");
        System.out.print("Qual o valor de A? ");
        int a = scanner.nextInt();
        
        if (a == 0) {
            System.out.println("Isso não é uma equação de segundo grau.");
            return;
        }
        
        System.out.print("Qual o valor de B? ");
        int b = scanner.nextInt();
        
        System.out.print("Qual o valor de C? ");
        int c = scanner.nextInt();
        
        System.out.println("");
        System.out.println("Equação ficou: " + a + "x\u00B2+" + b + "x+" + c + "=0"  );
        System.out.println("Sendo: \u0394 = " + b + "\u00B2-4." + a + "." + c);
        System.out.println("");
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Resultado de delta é " + delta);
        
        if (delta < 0) {
            System.out.println("Não existe raiz real");
        } else {
            System.out.println("Existem raízes reais");
        }
    }
    
}
