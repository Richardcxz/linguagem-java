package Java.lista2;
import java.util.Scanner;
public class a1 {
	public static void main(String[] args) {
		int x,som,n1,n2,n3,n4,n5;
		Scanner sc = new Scanner(System.in);
    System.out.println("Insira 5 números, exemplo 1 2 3 4 5");
	n1=sc.nextInt(); n2=sc.nextInt(); n3=sc.nextInt(); n4=sc.nextInt(); n5=sc.nextInt();
	System.out.print("Números pares: ");
	if(n1%2==0){
		System.out.printf("%d ",n1);
	}
	if(n2%2==0){
		System.out.printf("%d ",n2);
	}
	if(n3%2==0){
		System.out.printf("%d ",n3);
	}
	if(n4%2==0){
		System.out.printf("%d ",n4);
	}
	if(n5%2==0){
		System.out.printf("%d ",n5);
	}
	som=n1+n2+n3+n4+n5;
	System.out.println("");
	System.out.printf("Soma dos números: %d",som);
	}
}