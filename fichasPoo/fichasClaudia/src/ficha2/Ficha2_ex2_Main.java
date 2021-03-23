import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;


public class Ficha2_ex2_Main {

    public static void main (String[] args ){
        /*
        int[][] aluno = new int[5][5];
        Scanner ler= new Scanner(System.in);
        System.out.println("Escreva as notas do 1 aluno as 5 cadeiras");
        int nota15=ler.nextInt();
        int nota25=ler.nextInt();
        int nota35=ler.nextInt();
        int nota45=ler.nextInt();
        int nota55=ler.nextInt();
        aluno[0][0]=nota15;
        aluno[0][1]=nota25;
        aluno[0][2]=nota35;
        aluno[0][3]=nota45;
        aluno[0][4]=nota55;

        System.out.println("Escreva as notas do 2 aluno as 5 cadeiras");
        int nota1=ler.nextInt();
        int nota2=ler.nextInt();
        int nota3=ler.nextInt();
        int nota4=ler.nextInt();
        int nota5=ler.nextInt();
        aluno[1][0]=nota1;
        aluno[1][1]=nota2;
        aluno[1][2]=nota3;
        aluno[1][3]=nota4;
        aluno[1][4]=nota5;


        System.out.println("Escreva as notas do 3 aluno as 5 cadeiras");
        int nota12=ler.nextInt();
        int nota22=ler.nextInt();
        int nota32=ler.nextInt();
        int nota42=ler.nextInt();
        int nota52=ler.nextInt();
        aluno[2][0]=nota12;
        aluno[2][1]=nota22;
        aluno[2][2]=nota32;
        aluno[2][3]=nota42;
        aluno[2][4]=nota52;

        System.out.println("Escreva as notas do 4 aluno as 5 cadeiras");
        int nota13=ler.nextInt();
        int nota23=ler.nextInt();
        int nota33=ler.nextInt();
        int nota43=ler.nextInt();
        int nota53=ler.nextInt();
        aluno[3][0]=nota13;
        aluno[3][1]=nota23;
        aluno[3][2]=nota33;
        aluno[3][3]=nota43;
        aluno[3][4]=nota53;

        System.out.println("Escreva as notas do 5 aluno as 5 cadeiras");
        int nota14=ler.nextInt();
        int nota24=ler.nextInt();
        int nota34=ler.nextInt();
        int nota44=ler.nextInt();
        int nota54=ler.nextInt();
        aluno[4][0]=nota14;
        aluno[4][1]=nota24;
        aluno[4][2]=nota34;
        aluno[4][3]=nota44;
        aluno[4][4]=nota54;

       /* System.out.println("Escreva as notas do 6 aluno as 5 cadeiras");
        int nota15=ler.nextInt();
        int nota25=ler.nextInt();
        int nota35=ler.nextInt();
        int nota45=ler.nextInt();
        int nota55=ler.nextInt();
        aluno[0][0]=nota15;
        aluno[0][1]=nota25;
        aluno[0][2]=nota35;
        aluno[0][3]=nota45;
        aluno[0][4]=nota55;
        */

     //EX 1
     //System.out.println(Arrays.deepToString (aluno));

     /*EX 2 
     System.out.println("Cadeira 0-4?");
     int uc = ler.nextInt();
     Ficha2_ex2 aux;
     aux = new Ficha2_ex2();
    System.out.println(aux.somanotas(aluno,uc));
       */
       int [][]pauta = new int [5][5];

        pauta[0][0] = 15; pauta[0][1] = 2; pauta [0][2]=19; pauta [0][3] = 10; pauta[0][4] = 12;
        pauta[1][0] = 14; pauta[1][1] = 5; pauta [1][2]=14; pauta [1][3] = 11; pauta[1][4] = 12;
        pauta[2][0] = 9; pauta[2][1] = 12; pauta [2][2]=13; pauta [2][3] = 10; pauta[2][4] = 13;
        pauta[3][0] = 4; pauta[3][1] = 5; pauta [3][2]=14; pauta [3][3] = 11; pauta[3][4] = 12;
        pauta[4][0] = 20; pauta[4][1] =20; pauta [4][2]=14; pauta [4][3] = 11; pauta[4][4] = 12;

    //int[][] pauta = {{15,2,19,10,12},{14,5,14,11,12},{9,12,13,10,13},{4,5,14,11,12},{20,20,14,11,12}};

    /* EX3 
    System.out.println("ALUNO 0-4?");
     int uc = ler.nextInt();
     Ficha2_ex2 aux;
     aux = new Ficha2_ex2();
    System.out.println(aux.medianotas(aluno,uc));
         
     */
     Ficha2_ex2 aux;
     aux = new Ficha2_ex2();
    System.out.println(aux.notaalta(pauta));
 
       
    }

 }

    