import java.util.Arrays;
import java.time.LocalDate;

// ???? nao tenho a certeza 
public class Ficha2_ex4 {
 public static int[] ordenar(int[] array)}{
     int i=0,a=0;
     while (i<array.length){
     if (array[i]>array[i+1]){
         array[a]=array[a+1];
         array[i+1]=array[i];
         a++;
         i++;
     }
 }
 return array;
 }
