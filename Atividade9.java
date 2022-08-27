import java.io.IOException;
import java.util.Scanner;

public class Atividade9 {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            String NOME = leitor.next();
            double SALARIO, VENDAS, TOTAL;
            SALARIO = leitor.nextDouble();
            VENDAS = leitor.nextDouble();
            TOTAL = SALARIO + VENDAS * 0.15;
            System.out.printf(String.format("TOTAL = R$ %.2f", TOTAL));
        }
}
