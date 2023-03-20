import java.util.Scanner;

public class percentualDistribuidora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53;
        double totalM = SP + RJ + MG + ES + Outros;
        System.out.println("O percentual total da distribuidora de SP foi de: " +  Math.ceil((SP * 100) / totalM) +"%");
        System.out.println("O percentual total da distribuidora de RJ foi de: " +  Math.ceil((RJ * 100) / totalM) +"%");
        System.out.println("O percentual total da distribuidora de MG foi de: " +  Math.ceil((MG * 100) / totalM) +"%");
        System.out.println("O percentual total da distribuidora de ES foi de: " +  Math.ceil((ES * 100) / totalM) +"%");
        System.out.println("O percentual total da distribuidora de Outros foi de: " +  Math.ceil((Outros * 100) / totalM) +"%");
    }
}
