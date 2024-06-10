import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("======== calculadora ========");

        Scanner leitor = new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        double primeiroNumero = leitor.nextDouble();

        System.out.println("informe o segundo numero: ");
        double segundoNumero = leitor.nextDouble();

        System.out.println("informe qual operação deseja calcular:\n "
                + "1) somar\n"
                + "2) diminuir\n"
                + "3) multiplicar\n"
                + "4) dividir\n");
        int operacao = leitor.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = primeiroNumero + segundoNumero;

                break;

            case 2:
                resultado = primeiroNumero - segundoNumero;

                break;

            case 3:
                resultado = primeiroNumero * segundoNumero;

                break;

            case 4:
                if (segundoNumero != 0) {
                    resultado = primeiroNumero / segundoNumero;

                } else {
                    System.out.println("erro! informe um divisor diferente de zero");
                    return;
                }
                break;

            default:
                System.out.println("operação invalida, tente novamente");
                return;

        }
        System.out.println("o resultado da operação escolhida (" + operacao + ") é: " + resultado);

    }
}
