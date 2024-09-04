import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String str = ler.nextLine();

        int quantidadeA = 0;
        int quantidadeAMinuscula = 0;
        int quantidadeAMaiuscula = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a') {
                quantidadeA++;
                quantidadeAMinuscula++;
            } else if (c == 'A') {
                quantidadeA++;
                quantidadeAMaiuscula++;
            }
        }

        if (quantidadeA > 0) {
            System.out.println("A letra 'a' ocorre " + quantidadeA + " vez(es) na string.");
            System.out.println("A letra 'a' em minúscula ocorre " + quantidadeAMinuscula + " vez(es) na string.");
            System.out.println("A letra 'a' em maiúscula ocorre " + quantidadeAMaiuscula + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }
    }
}