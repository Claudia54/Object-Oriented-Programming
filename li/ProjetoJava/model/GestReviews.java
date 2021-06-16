
/**
 * Write a description of class GestReviews here.
 *
 * @author grupo 64
 * @version 030621
 */
package model;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

public class GestReviews
{
    public void guardaEstado(String nomeFich) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(nomeFich);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(this);
        
        fos.flush();
        fos.close();
    }
}
