import java.util.Scanner;
public class a7 {
	public static void main(String[] args) {
	int x,z,max=0;
	int q1=1,q2=2,q3=3,q4=4,q5=5,q6=6,q7=7,q8=8,q9=9,q10=10;
    Scanner sc = new Scanner(System.in);
	System.out.println("Informe um Número: ");
	max=sc.nextInt();
	for(x=1;x<=max;x++) {
	System.out.printf("Tabuada do %d\n",x);
	for(z=1;z<=max*10;z++);
	q1=0;q2=0;q3=0;q4=0;q5=0;q6=0;q7=0;q8=0;q9=0;q10=0;
	q1=x*1;q2=x*2;q3=x*3;q4=x*4;q5=x*5;q6=x*6;q7=x*7;q8=x*8;q9=x*9;q10=x*10;
	System.out.printf("%d*1=%d,%d*2=%d,%d*3=%d,%d*4=%d,%d*5=%d,",x,q1,x,q2,x,q3,x,q4,x,q5);
	System.out.printf("%d*6=%d,%d*7=%d,%d*8=%d,%d*9=%d,%d*10=%d",x,q6,x,q7,x,q8,x,q9,x,q10);
	System.out.println("\n---------------------------------------");
	}
	}
}
