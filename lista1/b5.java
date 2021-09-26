import java.util.Scanner;
public class b5 {
	public static void main(String[] args) {
		int x,mai = 0,men = 0,n1,n2,n3,n4,n5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 5 números, exemplo: 1 2 3 4 5");
		n1=sc.nextInt(); n2=sc.nextInt(); n3=sc.nextInt(); n4=sc.nextInt(); n5=sc.nextInt(); 
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5) {
		mai=n1;
		}
		else if(n2>n1 && n2>n3 && n2>n4 && n2>n5) {
			mai=n2;
			}
		else if(n3>n1 && n3>n2 && n3>n4 && n3>n5) {
			mai=n3;
			}
		else if(n4>n1 && n4>n2 && n4>n3 && n4>n5) {
			mai=n4;
			}
		else if(n5>n1 && n5>n2 && n5>n3 && n5>n4) {
			mai=n5;
			}
		
		if(n1<n2 && n1<n3 && n1<n4 && n1<n5) {
			men=n1;
			}
			else if(n2<n1 && n2<n3 && n2<n4 && n2<n5) {
				men=n2;
				}
			else if(n3<n1 && n3<n2 && n3<n4 && n3<n5) {
				men=n3;
				}
			else if(n4<n1 && n4<n2 && n4<n3 && n4<n5) {
				men=n4;
				}
			else if(n5<n1 && n5<n2 && n5<n3 && n5<n4) {
				men=n5;
				}
		System.out.printf("Maior: %d\n", mai);
		System.out.printf("Menor: %d",men);
	}
}
