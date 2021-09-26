package Java.lista2;
import java.util.Scanner;
public class b6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        int[] n = new int[21];

        System.out.print("Insira 20 números, exemplo 1 2 3: ");
        for(x=1;x<=20;x++){
        n[x] = sc.nextInt();
        }

        System.out.print("Números pares: ");
        for(x=1;x<=20;x++){
        if(n[x]%2==0){
        System.out.printf("%d ",n[x]);
        }}

        System.out.println("");

        System.out.print("Números ímpares: ");
        for(x=1;x<=20;x++){
            if(n[x]%3==0){
            System.out.printf("%d ",n[x]);
            }}
    } }