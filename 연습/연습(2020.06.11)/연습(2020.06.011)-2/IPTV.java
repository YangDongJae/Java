
/**
 * Write a description of class IPTV here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IPTV extends ColorTV
{
    private String ip;
    
    public IPTV(String ip, int size , int color){
        super(size, color);
        this.ip = ip;
    }
    
    protected String getIP(){
        return ip;
    }
    
    public void printProperty(){
        System.out.print("my IPTV have" + getIP() + "ip address");
        super.printProperty();
    }
}
