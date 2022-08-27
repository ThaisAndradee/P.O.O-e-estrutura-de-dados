import java.io.IOException;
import java.util.Scanner;

public class Atividade8 {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int funcionarios = leitor.nextInt();
            int horas = leitor.nextInt();
            double valorPorHora = leitor.nextDouble();
            double salario = horas * valorPorHora;
            System.out.printf("NUMBER = " + funcionarios);
            System.out.printf(String.format("SALARY = U$ %.2f", salario));
        }
}
