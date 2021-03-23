//package aula.pl1.ficha2;
import java.util.Arrays;


// ler inteiros para um array e determinar o valor minimo desse array 
public class Ficha2_ex1 {
   public static int ex_1(int[] inteiros ){
       int min = Integer.MAX_VALUE;
       int i;
       int pos=-1 ;//-1 caso o array seja vazio 
       for (i=0;i<inteiros.length ; i++){
           if (inteiros[i]<min){
               min=inteiros[i];
               pos=i;
           }
       }
   if (pos==-1)
   return (-1);
   else 
   return i;

   }  

    // ler dois arrays de inteiros e determinar o array com os elementos comuns aos dois arrays.

 public static int[] ex_3(int[] a,int[] a1){
        int p = 0;
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a1.length; j++) {
            if (a[i] == a1[j]) {
                p++;
            }
        }
        }
        int[] b = new int[p];
        int p1=0;       
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a1.length; j++){
                if (a[i]==a1[j]){
                    b[p1]=a[i];
                    p1++;
                }
            }
        }
    return b;
    }
}
   
       
    




     

