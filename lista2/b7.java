package Java.lista2;
import java.util.Scanner;
public class b7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,j,x,nn=10;
        int[] n = new int [11];

        System.out.print("Entre com 10 números: ");
        for(i=1;i<=10;i++){
        n[i] = sc.nextInt();}

        System.out.println("");

        System.out.print("Números em ordem crescente: ");
        
        for (i = 0; i <= nn; ++i){
    for (j = i + 1; j <= nn; ++j){
        if (n[i] > n[j]){
            x =  n[i];
            n[i] = n[j];
            n[j] = x;
        } } }
for (i = 1; i <= nn; ++i)
    System.out.printf("%d ", n[i]);

    } }