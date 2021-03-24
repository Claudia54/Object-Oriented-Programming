package fichasGusto;

import java.util.Scanner;
// Ficha 1 sulocao Gusto
public class ficha1 {
    public static void exe3(int[] cla){
        int count5 = 0, count10 = 0, count15 = 0, count20 = 0;


        for(int aluno:cla){
            if ((aluno >= 0)&&(aluno < 5)) count5++; //System.out.println("");
            else if (aluno < 10) count10++; //System.out.println("");
            else if (aluno < 15) count15++; //System.out.println("");
            else if  (aluno < 20) count20++;
        }
        System.out.printf("[0, 5[ = %d; [5, 10[ = %d; [10, 15[ = %d e [15, 20] = %d", count5,count10,count15,count20);

    }
}