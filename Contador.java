public class Contador {
    public static void main(String[] args) {

        int contador = 10;

        do {
            System.out.println(contador);
            contador -= 2;
        } while (contador >= 2);
    }
}