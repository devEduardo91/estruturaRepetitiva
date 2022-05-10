import java.util.Scanner;

public class beecrowd1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int combustivel = sc.nextInt();
        int alcool = 1;
        int gasolina = 2;
        int diesel = 0;

        while (combustivel != 4){
            combustivel = sc.nextInt();
            while (combustivel < 1 || combustivel > 4){
                combustivel = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: 1");
        System.out.println("Gasolina: 2");
        System.out.println("Diesel: 0");


        sc.close();
    }
}
