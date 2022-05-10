import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número:");
        int nmr = sc.nextInt();
        int soma = 0;

        while (nmr != 0){
            soma = soma + nmr;
            nmr = sc.nextInt();
        }
        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }
}
