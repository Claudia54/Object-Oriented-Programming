
/**
 * Write a description of class UserNotValidException here.
 *
 * @author grupo 64
 * @version (a version number or a date)
 */
package model.Business;

public class BusinessNotValidException extends Exception
{
    public BusinessNotValidException(){
        super();
    }
    
    public BusinessNotValidException(String msg){
        super(msg);
    }
}
