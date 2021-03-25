import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;
import java.lang.Math;

public class Ficha2_ex2 {
    public static int somanotas (int[][] nota ,int uc  ){ 
        int i =0 , soma=0;
        while (i!=5){  
        soma+=nota[i][uc];
        i++;
    }
    return soma;
}
   public static int medianotas (int[][]nota, int aluno ){
       int i=0,soma=0,media;
       while (i!=5){
       soma+=nota [aluno][i];
       i++;
   }
   media=soma/5;
   return media;
}
 public static int notaalta (int[][] nota){ 
     int a=0, max=nota[0][0];
     for (int i=0;i<nota.length;i++){
       int  b=0;
      while (b<nota[a].length){
        if (nota[i][b]>max){
            max=nota[i][b];
       }
       b++;
      } 
      a++;
     }
    return max;
 }
 public static int notabaixa (int[][] nota){ 
       int a=0, min=nota[0][0];
     for (int i=0;i<nota.length;i++){
       int  b=0;
      while (b<nota[a].length){
        if (nota[i][b]<min){
            min=nota[i][b];
       }
       b++;
      } 
      a++;
     }
    return min;

}
//Ver se encontro forma mais eficaz correndo so uma vez 
public static int[] notadet (int[][] nota,int no){
    /*int a =0,p=0;
    for(int i=0;i<nota.length;i++){
        int b =0;
          while (b<nota[a].length){
              if (nota[i][b]>=no){
                  p++;
              }
       b++;
      } 
      a++;
     }
     */
    int p =nota.length;
    int[] array = new int[p];
    int c=0 ,a1=0;
    for(int i=0;i<nota.length;i++){
        int b=0;
          while (b<nota[a1].length){
              if (nota[i][b]>=no){
                  array[c]=nota[i][b];
                  c++;
              }
       b++;
      } 
      a1++;
     }

    return array;
}

public static int[] arraytotring (int[][] nota){
    int a=0,c=0;
    int p =(nota.length)*(nota[a].length);
    int[] array = new int[p];
    for(int i=0;i<nota.length;i++){
        int b=0;
          while (b<nota[a].length){
                 array[c]=nota[i][b];
                 c++;
                 b++;
          }
      a++;
     }

    return array;
}
 public static int mediauc (int[][]nota, int uc ){
       int aluno=0,soma=0,media;
       while (aluno!=5){
       soma+=nota[aluno][uc];
       aluno++;
   }
   media=soma/5;
   return media;
}

 public static int indice (int[][]nota ){
     int r=0;
  int a= mediauc(nota,0);
  int b= mediauc(nota,1);
  int c= mediauc(nota,2);
  int d= mediauc(nota,3);
  int e= mediauc(nota,4);
  float maior = Math.max((Math.max(Math.max(a,b),Math.max(c,d))),e);

  if (maior == a) r=0;
  if (maior == b) r=1;
  if (maior == c) r=2;
  if (maior == d) r=3;
  if (maior == e) r=4;

return r;
}
}


/*
pauta[0][0] = 15; pauta[0][1] = 2; pauta [0][2]=10; pauta [0][3] = 10; pauta[0][4] = 12;
pauta[1][0] = 17; pauta[1][1] = 5; pauta [1][2]=14; pauta [1][3] = 11; pauta[1][4] = 20;
pauta[2][0] = 9; pauta[2][1] = 12; pauta [2][2]=13; pauta [2][3] = 10; pauta[2][4] = 13;
pauta[3][0] = 4; pauta[3][1] = 5;  pauta [3][2]=14; pauta [3][3] = 11; pauta[3][4] = 12;
pauta[4][0] = 20; pauta[4][1] =20; pauta [4][2]=14; pauta [4][3] = 11; pauta[4][4] = 12;

    */