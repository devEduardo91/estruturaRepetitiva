import java.util.Scanner;
public class ProblemaExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO");
        int entrada = scanner.nextInt();
        int soma = 0;
        while (entrada != 0){
            soma = soma + entrada;
            entrada = scanner.nextInt();
        }

        System.out.println("A soma é: " + soma);
        scanner.close();
    }
}



