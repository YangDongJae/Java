
/**
 * Write a description of interface PhoneInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface PhoneInterface
{
    public static final int TIMEOUT = 10000;
    
    public abstract void sendCall();
    public abstract void receiveCall();
    
    public default void printLogo(){
        System.out.println("***** Phone *****");
    }
}
