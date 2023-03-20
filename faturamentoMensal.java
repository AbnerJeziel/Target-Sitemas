import java.util.Scanner;

public class faturamentoMensal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double faturamentoD[] = new double [30], maior = 0, menor = 0, soma = 0, mediaM = 0;
        int cont = 0, diasDeFaturamento = 0;
        for (int i = 0; i < faturamentoD.length; i++) {
            System.out.println("Digite o valor faturado no "+ (i+1)+"º dia do mês");
            faturamentoD[i] = entrada.nextDouble();
            if (faturamentoD[i] > maior) {
                maior = faturamentoD[i];
            }
            if (i == 0) {
                menor = faturamentoD[0];
            } else if (menor > faturamentoD[i]) {
                menor = faturamentoD[i];
            }
            if (faturamentoD[i] > 0) {
                diasDeFaturamento++;
            }
            soma += faturamentoD[i];  
        }
        for (int i = 0; i < faturamentoD.length; i++) {
            mediaM = soma / diasDeFaturamento;
            if (faturamentoD[i] > mediaM) {
                cont++;
            }
        }
        System.out.println("O maior faturamento mensal foi: "+ maior);
        System.out.println("O menor faturamento mensal foi: "+ menor);
        System.out.println("A média do faturamento mensal foi: "+mediaM+" e o número de dias que passaram desta média foi de : "+cont);
    }
}
