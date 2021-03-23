///package aula.pl1.ficha2;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;


public class Ficha2_ex1_Main {
    
    public static void main (String[] args){

     /// EX 1    
   /* int i,a;
    int valor=0;
    int result;
    Scanner ler = new Scanner (System.in);
    System.out.println ("Quantos números quer no array ? " ); 
    int n = ler.nextInt();
    int[] valores = new int[n];
    for (i=0;i<n;i++){
     valor = ler.nextInt();
     valores[i]=valor;
    }
   ler.close();
   Ficha2_ex1 aux;
   aux = new Ficha2_ex1();
   result = aux.ex_1(valores);
   System.out.println ("O  numero é " + result );
   

   //Ex2
   int i,j;
    int valor=0;
    int result;
    Scanner ler = new Scanner (System.in);
    System.out.println ("Quantos números quer no array ? " ); 
    int n = ler.nextInt();
    int[] valores = new int[n];
    System.out.println (" escreva 2 Posiçoes do array " ); 
    int a =ler.nextInt();
    int b = ler.nextInt();
    for (i=0;i<n;i++){
     valor = ler.nextInt();
     valores[i]=valor;
    }
    if (b>a){
         for(j=a; j==b;j++) {
             System.out.print(valores[a]);
         }
    }
    else  
      System.out.print("-1");
      */
     //ex 3

    int i,j;
    int valor=0, valor2=0;
    Scanner ler = new Scanner (System.in);
    System.out.println ("Quantos números quer no array ? " ); 
    int n = ler.nextInt();
    int[] valores = new int[n];
    
    for (i=0;i<n;i++){
     valor = ler.nextInt();
     valores[i]=valor;
    } 
    System.out.println ("Quantos números quer no 2 array ?" ); 
    int segundo = ler.nextInt();
    int[] valores2 = new int[segundo];
   
    for (j=0;j<segundo;j++){
     valor2 = ler.nextInt();
     valores2[j]=valor2;
    } 
   //int[] val= new int[n];
   System.out.println ("done");
   Ficha2_ex1 aux;
   aux = new Ficha2_ex1();
   System.out.println (Arrays.toString(aux.ex_3(valores,valores2)));
   


    /*
    int w,c=-1;
        int b=0 ;
        int[] val = new int[n];
      for(int f=0;f<n;f++){
      for(w=0; valores[b]!=valores2[w];i++)
      if (valores[b]==valores2[i]){
          c++;
          val[c]=valores[b];
     }
     b++;
     System.out.print(val[c]);
     */
     ler.close();
}
}