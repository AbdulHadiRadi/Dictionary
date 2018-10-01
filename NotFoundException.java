
/**
 * Write a description of class NotFOundException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  NotFoundException extends Exception
{
    private String argument;
    public NotFoundException(String arg)
    {
        // initialise instance variables
        super(arg);
    }
    
}
