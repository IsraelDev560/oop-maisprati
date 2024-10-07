package abstraction;

import abstraction.exercises.Boleto;
import abstraction.exercises.FormaPagamento;
import abstraction.exercises.Pix;

import java.util.Locale;
import java.util.Scanner;

public class Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Escolha uma forma de pagamento.");
        System.out.println("Boleto, Pix ou Cartão de credito.");
        String opcao = scanner.next().toUpperCase();
        switch (opcao){
            case "BOLETO":
                System.out.println("Insira o codigo do Boleto:");
                String codigo = scanner.next();
                System.out.println("Insira o valor a pagar");
                double valorAPagar = scanner.nextDouble();
                System.out.println("Insira seu dinheiro");
                double valorPago = scanner.nextDouble();
                Boleto boleto = new Boleto(codigo, valorAPagar);
                boleto.processarPagamento(valorPago);
                boleto.validarPagamento();
                break;
            case "PIX":
                System.out.println("Insira o nome, email, ou chave aleatoria.");
                String destinatario = scanner.next();
                System.out.println("Insira o valor a pagar");
                valorAPagar = scanner.nextDouble();
                System.out.println("Digite 'SIM' para confirmar, e 'NÃO' para cancelar.");
                String confirm = scanner.next().toUpperCase();
                Pix pix = new Pix(destinatario, confirm);
                pix.processarPagamento(valorAPagar);
                pix.validarPagamento();
                break;
            default:
                System.out.println("Operação invalida ou não encontrada");
        }
    }
}
