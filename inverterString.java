import java.util.Scanner;

public class inverterString {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a string que deseja inverter: ");
        String inputString = entrada.nextLine();

        char[] charVetor = inputString.toCharArray();

        int esq = 0;
        int dir = charVetor.length - 1;

        while (esq < dir) {
            char temp = charVetor[esq];
            charVetor[esq] = charVetor[dir];
            charVetor[dir] = temp;

            esq++;
            dir--;
        }

        String stringReversa = new String(charVetor);
        System.out.println("A string invertida é: " + stringReversa);
    }
}