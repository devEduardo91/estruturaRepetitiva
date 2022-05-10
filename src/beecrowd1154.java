import java.util.Scanner;

public class beecrowd1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System . in);
        int idade, soma, divisao;
        idade = sc.nextInt();
        soma = 0;
        divisao = 0;

        while (idade < 0){
            idade = sc.nextInt();
                soma = soma + idade;
                divisao = idade / soma ;
                System.out.println(divisao);
            }
        sc.close();
    }
    }

