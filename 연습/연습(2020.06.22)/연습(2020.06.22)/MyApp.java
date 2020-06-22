
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
        
        IPTV iptv = new IPTV("192.1.1.2", 32,2048);
        
        iptv.printProperty();
    }

}
