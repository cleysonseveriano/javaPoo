import java.util.Scanner;

public class Main {
    public void media(){
        float n1,n2,n3,media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextFloat();

        media = (n1+n2+n3)/3;
        System.out.println("As notas do aluno são: " + n1 + " " + n2 + " " +n3);
        System.out.println("E a média: " + String.format("%.2f",media));
    }

    public void soma(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o 1° n°: ");
        int n1 = ler.nextInt();
        System.out.print("Digite o 2° n°: ");
        int n2 = ler.nextInt();
        System.out.print("Digite o 3° n°: ");
        int n3 = ler.nextInt();
        System.out.print("Digite o 4° n°: ");
        int n4 = ler.nextInt();
        System.out.print("Digite o 5° n°: ");
        int n5 = ler.nextInt();
        System.out.print("Digite o 6° n°: ");
        int n6 = ler.nextInt();
        int[] array = {n1,n2,n3,n4,n5,n6};
        //int soma = n1+n2+n3+n4+n5+n6;
        int soma = 0;
        for(int i = 0; i < array.length; i++){
            soma+= array[i];
        }
        System.out.println("Soma: " + soma);
    }

    public void abcd(){
        Scanner ler = new Scanner(System.in);
        float a = ler.nextFloat();
        float b = ler.nextFloat();
        float c = ler.nextFloat();
        float d = ler.nextFloat();

        float calc = (a+b)*(c-d);

        System.out.println("O resultado final da expressão: " + calc);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.soma();
    }
}