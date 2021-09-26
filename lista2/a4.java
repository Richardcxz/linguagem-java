package Java.lista2;
import java.util.Scanner;
public class a4 {
	public static void main(String[] args) {
		int x,pri=1,n1,n2,n3,n4,n5;
		Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma sequência de 5 números, exemplo 1 2 3 4 5");
        n1=sc.nextInt();n2=sc.nextInt();n3=sc.nextInt();n4=sc.nextInt();n5=sc.nextInt();
        System.out.print("Números primos: ");
        for (x=2;x<=n1; x++) {
			if ( ( (n1 % x) == 0) && (x != n1) ) {
				pri = 0;
				break;
                 }
            else{
                System.out.printf("%d ",n1);
                break;
            } }
            for (x=2;x<=n2; x++) {
                if ( ( (n2 % x) == 0) && (x != n2) ) {
                    pri = 0;
                    break;
                     }
                else{
                    System.out.printf("%d ",n2);
                    break;
                } }
                for (x=2;x<=n3; x++) {
                    if ( ( (n3 % x) == 0) && (x != n3) ) {
                        pri = 0;
                        break;
                         }
                    else{
                        System.out.printf("%d ",n3);
                        break;
                    } }
                    for (x=2;x<=n4; x++) {
                        if ( ( (n4 % x) == 0) && (x != n4) ) {
                            pri = 0;
                            break;
                             }
                        else{
                            System.out.printf("%d ",n4);
                            break;
                        }
                         }
                        for (x=2;x<=n5; x++) {
                            if ( ( (n5 % x) == 0) && (x != n5) ) {
                                pri = 0;
                                break;
                                 }
                            else{
                                System.out.printf("%d ",n5);
                                break;
                            } }
 }  }