
/**
 * Write a description of class MobilePhone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MobilePhone extends Phone
{
    private boolean connectStatus;
    private int battery;
    
    public MobilePhone(){
        setBattery(20);
        setConnectStatus(true);
    }
    
    public void setBattery(int n){
        this.battery = n;
    }
    
    public void setConnectStatus(boolean b){
        this.connectStatus = b;
    }
}
