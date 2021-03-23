import java.util.Scanner;
public class Exemplo4{
    public static void main (String [] args){
        int soma, n;
        String resp;
        Scanner input = new Scanner (System.in);
        do{
            System.out.println ("Quantos números vai somar ?");
            n= input.nextInt();
            soma=0;
            for (int i=0;i<n;i++){
                System.out.print("Valor: ");
                soma += input.nextInt();
            }
            System.out.println ("O somatório é :" +soma);
            System.out.print ("Quer repetir ? [s/n]");
            resp= input.next ();
        } while (resp.charAt(0) != 'n');
        input.close();
        System.out.println("Adeus !");
    }
}