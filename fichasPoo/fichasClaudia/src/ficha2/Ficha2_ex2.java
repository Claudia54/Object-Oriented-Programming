import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;


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
//C bug
 public static int notaalta (int[][] nota){ 
     int b=0 ,a=0, max =nota[0][0];
     int n = nota.length;
     int na=nota[a].length;
     for (int i=0;i<n;i++){
      while (b<na){
        if (nota[i][b]>max){
            max=nota[i][b];
       }
       b++;
      }
     }
    return max;
 }
}
    