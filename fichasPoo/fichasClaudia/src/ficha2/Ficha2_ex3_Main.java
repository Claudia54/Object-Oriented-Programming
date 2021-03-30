import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;
import java.time.LocalDate;

public class Ficha2_ex3_Main {
public static void main (String[] args ){
     Ficha2_ex3 dateArray = new Ficha2_ex3(5);
                dateArray.insereData(LocalDate.of(2020,2,29));
                System.out.println("Inserida data 2020-02-29");
                dateArray.insereData(LocalDate.of(2000, 8, 31));
                System.out.println("Inserida data 2000-08-31");
                dateArray.insereData(LocalDate.of(2012,12,21));
                System.out.println("Inserida data 2012-12-21");
                dateArray.insereData(LocalDate.of(2001,9,11));
                System.out.println("Inserida data 2001-09-11");
    LocalDate currentDateTime = LocalDate.now();
    System.out.println(dateArray.dataMaisProximacontas(currentDateTime));

     }


}


    