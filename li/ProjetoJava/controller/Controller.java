package controller;

import java.time.DateTimeException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.AbstractMap.SimpleEntry;

import model.*;
import view.*;

public class Controller {


    public void menuEstatisticas(){
        Scanner scan= new Scanner(System.in);
        View view =new View();
        GestReviews gest = new GestReviews();
        int instruction ;
        try{
            instruction = scan.nextInt();
            scan.nextLine();
       }
       catch (InputMismatchException e) {
           view.notAnInstruction();
       }

    }


 

	public void menu(){
     Scanner scan= new Scanner(System.in);
     View view =new View();
     GestReviews gest = new GestReviews();
        view.menu();
        int instruction;
        try{
             instruction = scan.nextInt();
             scan.nextLine();
        }
        catch (InputMismatchException e) {
            view.notAnInstruction();
        }
        switch(instruction){
            case 0 :
              view.menuEstatisticas();
              menuEstatisticas();
            case 1 :
                SimpleEntry <Integer,Set<String>> n; 
                n = gest.query1();
                //view.query1(n);  ///// criar isto na view
                break;

            case 2: 
                int mes = scan.nextInt();
                scan.nextLine();
                int ano = scan.nextInt();
                scan.nextLine();
                    
                SimpleEntry <Integer,Integer> r;
                r = gest.query2 (mes,ano);
                //view.query2(r);
                break;
                
            case 3: 
                String user3 = scan.nextLine();
                //view.q3(user3,gest.query3(user3));
                break;
            
            case 4 : 
                 String businessID = scan.nextLine();
                 //view.q4( gest.query4(businessID),businessID);
                 break;
                
            case 5: 
                String user =scan.nextLine();
                //view.query5(user,gest.query5(user));
                break;

            case 7 : 
                //view.q7(gest.query7());
                break; 
                    
            case 8: 
                int nUsers = scan.nextInt();
                scan.nextLine();
                //view.q8(nUsers,gest.query8(nUsers));
                break;   
            default : 
                //view.notAnInstruction();
                break;
        }
    }
    
}
