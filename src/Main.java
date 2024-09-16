import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Indique su nivel actual de combustible: ");
        double nivelActual = scan.nextDouble();

        if (nivelActual >= 20) {
            System.out.println("Nivel de combustible suficiente");
        } else {
            System.out.println("Nivel de combustible insuficiente, reabastecer.");
        }
    }
}
