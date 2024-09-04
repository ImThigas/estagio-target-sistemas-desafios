import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numeroInformado = ler.nextInt();
        System.out.print("Informe a quantidade de repetições que você deseja: ");
        int quantidadeRepeticoes = ler.nextInt();
        int n1 = 0, n2 = 1;
        boolean encontrado = false;

        for (int i = quantidadeRepeticoes; i > 0; i--) {
            if (n1 == numeroInformado) {
                encontrado = true;
                break;
            }
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        if (encontrado) {
            System.out.println("\nO número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }
}