import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        double a=0,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a Base: ");
    b= sc.nextDouble();
    System.out.println("Informe a Altura: ");
    c= sc.nextDouble();

    a=(b*c)/2;

    System.out.printf("Área da pirâmide= %f",a);
}}
