import java.util.Scanner;



public class a2
{
    //Atributos da classe
    private double n1,n2, resultado; //Variáveis privadas (Encapsulamento)
    private Scanner s;

    //Métodos da classe
    public a2() //Método construtor
    {
        n1 = 0;
        n2 = 0;
        resultado = 0;
        s = new Scanner(System.in);
    }

    public void lerValores()
    {
        System.out.println("Informe n1..:");
        n1 = s.nextDouble();
        System.out.println("Informe n2..:");
        n2 = s.nextDouble();
    }

    public void somar()
    {
        resultado = n1 + n2;
    }

    public void subtrair()
    {
        resultado = n1 - n2;
    }

    public void multiplicar()
    {
        resultado = n1 * n2;
    }

    public void dividir()
    {
        resultado = n1 / n2;
    }

    public void imprimirResultado()
    {
        System.out.printf("Resultado = %.2f\n",resultado);
    }

    public static void main(String args[])
    {
        a2 obj = new a2(); //Instância da classe calculadora
//Objeto
        int op;
        Scanner s2 = new Scanner(System.in);

        do
        {
            System.out.println("1 - Entrada de dados");
            System.out.println("2 - Somar");
            System.out.println("3 - Subtrair");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Dividir");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção..:");
            op = s2.nextInt();
            switch(op)
            {
                case 1:
                    obj.lerValores();
                    break;
                case 2:
                    obj.somar();
                    obj.imprimirResultado();
                    break;
                case 3:
                    obj.subtrair();
                    obj.imprimirResultado();
                    break;
                case 4:
                    obj.multiplicar();
                    obj.imprimirResultado();
                    break;
                case 5:
                    obj.dividir();
                    obj.imprimirResultado();
                    break;
            }
        }while(op >=1 && op <6);

    }
}