import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            calcularIMC(scanner);
            
            System.out.println("\nDeseja calcular outro IMC? (s/n)");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));
                
        
        scanner.close(); 
    }
    
    public static void calcularIMC(Scanner scanner) {
        scanner.useLocale(Locale.US);

        System.out.println("\nQual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual é a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual o seu peso? ");
        double peso = scanner.nextDouble();

        System.out.println("Qual a sua altura? ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso!";
        } else if (imc < 25) {
            classificacao = "Peso normal!";
        } else if (imc < 30) {
            classificacao = "Sobrepeso!";
        } else {
            classificacao = "Obesidade!";
        }

        System.out.printf("Olá %s, você tem %d anos, pesa %.1fkg, tem %.2fm de altura.\nSeu IMC é %.2f e está classificado como %s",
                nome, idade, peso, altura, imc, classificacao
            );


            

    }
}