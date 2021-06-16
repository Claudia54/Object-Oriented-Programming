
/**
 * Write a description of class UserNotValidException here.
 *
 * @author grupo 64
 * @version (a version number or a date)
 */

package model.Reviews;
public class ReviewNotValidException extends Exception
{
    public ReviewNotValidException(){
        super();
    }
    
    public ReviewNotValidException(String msg){
        super(msg);
    }
}
