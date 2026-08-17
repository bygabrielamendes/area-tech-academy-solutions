import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resultado1 = num1 * num1;
        int resultado2 = num2 * num2;
        int resultado = Math.abs(resultado1 - resultado2);
        // Sua solução aqui
        System.out.println(resultado);
    }
}