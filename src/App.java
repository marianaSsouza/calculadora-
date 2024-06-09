import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("======== calculadora ========");

        Scanner leitor = new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        double primeiroNUmero = leitor.nextDouble();

        System.out.println("certo, agora informe o segundo numero: ");
        double segundoNumero = leitor.nextDouble();

        System.out.println("informe qual operação deseja calcular ( +, - , *, /): ");
        char operacao = leitor.next().charAt(0);
        


    }
}
