public class Loops {
    public static void main(String[] args) {
        // while, do-while, for
        // valor inicial, condição de parada, atualização

        int valor = 0;

        while(valor < 100) {
            System.out.println(valor);
            valor++;
        }

        // do-while
        System.out.println("---------------");
        int valor2 = 1000;

        do {
            System.out.println(valor2);
            valor2++;
        } while(valor2 < 100);

        // for
        System.out.println("---------------");

        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
