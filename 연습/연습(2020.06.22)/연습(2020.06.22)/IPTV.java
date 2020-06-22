
/**
 * Write a description of class IPTV here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IPTV extends ColorTV
{
    private String ipAdress;
    
    IPTV(String ipAdress , int size , int color){
        super(size,color);
        this.ipAdress = ipAdress;
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printProperty()
    {
        System.out.println(this.ipAdress + getSize() + "inch" + getColor() + "color");
    }
}
