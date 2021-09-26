package Java.lista2;
import java.util.Scanner;
public class a8 {
	public static void main(String[] args) {
		int x,mai = 0,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 10 números, exemplo: 1 2 3");
		n1=sc.nextInt(); n2=sc.nextInt(); n3=sc.nextInt(); n4=sc.nextInt(); n5=sc.nextInt(); 
        n6=sc.nextInt(); n7=sc.nextInt(); n8=sc.nextInt(); n9=sc.nextInt(); n10=sc.nextInt(); 

		if(n1>n2 && n1>n3 && n1>n4 && n1>n5 && n1>n6 && n1>n7 && n1>n8 && n1>n9 && n1>n10) {
		mai=n1;
		}
		else if(n2>n1 && n2>n3 && n2>n4 && n2>n5 && n2>n6 && n2>n7 && n2>n8 && n2>n9 && n2>n10) {
			mai=n2;
			}
		else if(n3>n1 && n3>n2 && n3>n4 && n3>n5 && n3>n6 && n3>n7 && n3>n8 && n3>n9 && n3>n10) {
			mai=n3;
			}
		else if(n4>n1 && n4>n2 && n4>n3 && n4>n5 && n4>n6 && n4>n7 && n4>n8 && n4>n9 && n4>n10) {
			mai=n4;
			}
		else if(n5>n1 && n5>n2 && n5>n3 && n5>n4 && n5>n6 && n5>n7 && n5>n8 && n5>n9 && n5>n10) {
			mai=n5;
			}
        else if(n6>n1 && n6>n2 && n6>n3 && n6>n4 && n6>n5 && n6>n7 && n6>n8 && n6>n9 && n6>n10) {
		mai=n6;
		}
		else if(n7>n1 && n7>n2 && n7>n3 && n7>n4 && n7>n5 && n7>n6 && n7>n8 && n7>n9 && n7>n10) {
			mai=n7;
			}
		else if(n8>n1 && n8>n2 && n8>n3 && n8>n4 && n8>n5 && n8>n6 && n8>n7 && n8>n9 && n8>n10) {
			mai=n8;
			}
		else if(n9>n1 && n9>n2 && n9>n3 && n9>n4 && n9>n5 && n9>n6 && n9>n7 && n9>n8 && n9>n10) {
			mai=n9;
			}
		else if(n10>n1 && n10>n2 && n10>n3 && n10>n4 && n10>n5 && n10>n6 && n10>n7 && n10>n8 && n10>n9) {
			mai=n10;
			}
		System.out.printf("Maior: %d\n", mai);
	}
}
