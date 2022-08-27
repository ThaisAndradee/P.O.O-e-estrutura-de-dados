import java.io.IOException;
import java.util.Scanner;

public class Atividade14 {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int x = leitor.nextInt();
            double y = leitor.nextDouble();
            double media = leitor.nextDouble();
            System.out.printf(String.format("%.3f km/l", media));
        }
}
