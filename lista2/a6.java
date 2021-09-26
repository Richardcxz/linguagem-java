package Java.lista2;
import java.util.Scanner;
public class a6 {
	public static void main(String[] args) {
		int x,som,tot=0;
        int[] n = new int [31];
        int[] quad = new int [31];
		Scanner sc = new Scanner(System.in);

        System.out.print("Números = ");
        for(x=1;x<=30;x++){
        n[x]=x;
        System.out.printf("%d ",n[x]);
        }
        System.out.println("");
        System.out.print("Soma do quadrado dos números = ");
        for(x=1;x<=30;x++){
        quad[x]=n[x]*n[x];
        }
        for(x=1;x<=30;x++){
        tot=tot+quad[x];
        }
        System.out.printf("%d",tot);
         }}