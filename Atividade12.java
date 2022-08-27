import java.io.IOException;
import java.util.Scanner;

public class Atividade12 {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            double a = leitor.nextDouble();
            double b = leitor.nextDouble();
            double c = leitor.nextDouble();
            double triangulo = a * c / 2.0;
            double circulo = 3.12159 * (c * c);
            double trapezio = ((a + b) * c) / 2;
            double quadrado = b * b;
            double retangulo = a * b;
            System.out.printf(String.format("TRIANGULO: %.3f", triangulo));
            System.out.printf(String.format("CIRCULO: %.3f", circulo));
            System.out.printf(String.format("TRAPEZIO: %.3f", trapezio));
            System.out.printf(String.format("QUADRADO: %.3f", quadrado));
            System.out.printf(String.format("RETANGULO: %.3f", retangulo));
        }
}
