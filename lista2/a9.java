package Java.lista2;
import java.util.Scanner;
public class a9 {
    public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
        int[] n = new int [21];

        System.out.println("Insira 20 números, exemplo 1 2 3");
        for(x=1;x<=20;x++){
        n[x]=sc.nextInt();
        }
        System.out.print("Maiores que 50: ");
        for(x=1;x<=20;x++){
        if(n[x]>50){
        System.out.printf("%d ",n[x]);
        }
        }
 }
}
