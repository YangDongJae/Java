
/**
 * Write a description of class IPTV here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IPTV extends ColorTV
{
    private String ipAddress;

    public IPTV(String address, int size, int color){
        super(size,color);
        this.ipAddress = address;
    }   
    
    public void printProperty (){
        System.out.println("my IPTV have" + ipAddress + "address" + getsize() + "inch" + getColor() + "color");
    }
}
