
/**
 * Write a description of class UserNotValidException here.
 *
 * @author grupo 64
 * @version (a version number or a date)
 */


package model;
public class UserNotValidException extends Exception
{
    public UserNotValidException(){
        super();
    }
    
    public UserNotValidException(String msg){
        super(msg);
    }
}
