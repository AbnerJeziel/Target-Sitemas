import java.util.Scanner;

/**
 * sequenciaFibonacci
 */
public class sequenciaFibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, sequencia = 1, i = 0;
        System.out.println("Digite um número inteiro: ");
        n = entrada.nextInt();
        if (n >= 0){
            do {
                i = i + sequencia;
                sequencia = i + sequencia;
                System.out.println(i+ "e" + sequencia);
            } while (sequencia < n);
            if (sequencia == n) {
                System.out.println("O número faz parte da sequência!");
            } else {
                System.out.println("O número não faz parte da sequência");
            }
        } else {
            System.out.println("O número digitado é inválido!");
        }
    }
}