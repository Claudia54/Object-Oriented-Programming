import java.util.Scanner;

public class Exe1a {
    public static void main (String [] args ){
        int d,m,a ,a1,dias=0,m1,fim;
        String resp;
        Scanner dia = new Scanner (System.in);
        Scanner mes = new Scanner (System.in);
        Scanner ano = new Scanner (System.in);
        System.out.println ("Escreva um dia");
        d= dia.nextInt();
        System.out.println ("Escreva um mes");
        m= mes.nextInt();
        System.out.println ("Escreva um ano");
        a =ano.nextInt();
        a1=a-1900;
        a1=a1*365;
        a1+=(a1-1900)/4;
        if (((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0)))&& (m==2|| m==1)) {
            a1=a1-1;   
        }
        m1=m-1;
        while ( m1!=1){
            if (m1%2 ==1){
                dias+=31;
            }
            else {
                dias+=30;   
            }
            m1=m1-1;
            }
        
        dias +=d;    
        fim = a1+dias ;
        if (fim %7 == 0) {
             System.out.println ("Domingo");
        }
        if (fim %7 == 1) {
             System.out.println ("Segunda");
        }
        if (fim %7 == 2) {
             System.out.println ("Terça");
        }
        if (fim %7 == 3) {
             System.out.println ("Quarta");
        }
        if (fim %7 == 4) {
             System.out.println ("Quinta");
        }
        if (fim %7 == 5) {
             System.out.println ("Sexta");
        }
        if (fim %7 == 6)      {
        System.out.println ("Sabado");
        }
        dia.close();
        mes.close();
        ano.close();
    }
}