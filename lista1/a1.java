package Java.lista1;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int a=10;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Insira o valor de B: ");
        b = sc.nextInt();
        System.out.printf("Soma = %d",a+b);
    }
}