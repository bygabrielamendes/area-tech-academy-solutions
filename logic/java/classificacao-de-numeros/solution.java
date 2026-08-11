import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

        // Sua solução aqui
        if(a > b){
          System.out.println("a é maior que b");
        }else if(a < b){
          System.out.println("a é menor que b");
        } else{
          System.out.println("a é igual a b");
        }

    }
}