import model.*;
//import controller.*;
import view.*;
import loaders.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner ;

public class Programa {

    
    
    public static void main (String[] args ) throws IOException{

        Loadlog log = new Loadlog();

        BusinessList businesses = new BusinessList();
        ReviewList reviews       = new ReviewList();
        UserList users          = new UserList();
        
        log.load(log.getFichDefaut(), businesses, reviews, users);

        businesses.mostrarBusinesss();

    }



}





