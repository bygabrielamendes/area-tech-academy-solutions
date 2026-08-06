import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ler o primeiro número inteiro
        int num1 = scanner.nextInt();
        // TODO: Ler o segundo número inteiro
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int soma = 0;
        // TODO: Calcular a soma dos números inteiros entre os dois números
        for(int i = menor + 1; i < maior; i++){
          soma += i;
        }

        System.out.println(soma);
    }
}
