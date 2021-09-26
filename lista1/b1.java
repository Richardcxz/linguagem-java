import java.util.Scanner;
public class b1 {
	public static void main(String[] args) {
		int x,num,pri=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número:");
		num=sc.nextInt();
		for(x=1;x<=num;x++) {
		if(num%2==1) {
		pri++;
		}
		}
		if(pri>0) {
		System.out.println("O número é primo.");
		}
		else if(pri==0) {
		System.out.println("O número não é primo.");
		}
	}
}
