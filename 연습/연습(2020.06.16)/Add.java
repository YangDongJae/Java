
/**
 * Add Number a b
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class Add extends Calc implements PhoneInterface
{
    /**
     * 
     * Sub add
     * 
     * @return a + b
     */
    @Override
    public int calculate(){
        return a + b;
    }
    
    public void sendCall(){
        System.out.println("start send Call in Add Class");
    }
    
    public void receiveCall(){
        System.out.println("Receive Call in Add Class");
    }
}
