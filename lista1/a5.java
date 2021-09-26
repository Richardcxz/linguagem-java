import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        int a,b,c,d,e,impa=0,impb=0,impc=0,impd=0,impe=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        a=sc.nextInt();
        if((a%2)>0){
            impa=a;
        }
        System.out.println("Digite o numero 2: ");
        b=sc.nextInt();
        if((b%2)>0){
            impb=b;
        }
        System.out.println("Digite o numero 3: ");
        c=sc.nextInt();
        if((c%2)>0){
            impc=c;
        }
        System.out.println("Digite o numero 4: ");
        d=sc.nextInt();
        if((d%2)>0){
            impd=d;
        }
        System.out.println("Digite o numero 5: ");
        e=sc.nextInt();
        if((e%2)>0){
            impe=e;
        }
        System.out.println("Foram Identificados os seguintes ímpares: ");
        if(impa>0) {
            System.out.printf("%d ",impa);
        }
        if(impb>0) {
            System.out.printf("%d ",impb);
        }
        if(impc>0) {
            System.out.printf("%d ",impc);
        }
        if(impd>0) {
            System.out.printf("%d ",impd);
        }
        if(impe>0) {
            System.out.printf("%d ",impe);
        }
}}
