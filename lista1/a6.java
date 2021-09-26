import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        int a,b,c,d,e,para=0,parb=0,parc=0,pard=0,pare=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        a=sc.nextInt();
        if((a%2)==0){
            para=a;
        }
        System.out.println("Digite o numero 2: ");
        b=sc.nextInt();
        if((b%2)==0){
            parb=b;
        }
        System.out.println("Digite o numero 3: ");
        c=sc.nextInt();
        if((c%2)==0){
            parc=c;
        }
        System.out.println("Digite o numero 4: ");
        d=sc.nextInt();
        if((d%2)==0){
            pard=d;
        }
        System.out.println("Digite o numero 5: ");
        e=sc.nextInt();
        if((e%2)==0){
            pare=e;
        }
        System.out.println("Foram Identificados os seguintes ímpares: ");
        if(para>0) {
            System.out.printf("%d ",para);
        }
        if(parb>0) {
            System.out.printf("%d ",parb);
        }
        if(parc>0) {
            System.out.printf("%d ",parc);
        }
        if(pard>0) {
            System.out.printf("%d ",pard);
        }
        if(pare>0) {
            System.out.printf("%d ",pare);
        }
    }}
