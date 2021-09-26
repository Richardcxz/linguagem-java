package Java.lista2;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
        int[] n = new int [11];
        for(x=0;x<=10;x++){
        n[x]=2+2*x;
        }

        System.out.print("Valores: ");
        for(x=1;x<=10;x++){
        System.out.printf("%d ",n[x]);
        }
 }
}
