
/**
 * Sub Number a b
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class Sub extends Calc implements PhoneInterface
{
    /**
     * 
     * Sub method
     * 
     * @return a - b
     */
    public int calculate(){
        return a - b;
    }
    
        public void sendCall(){
        System.out.println("start send Call in Sub Class");
    }
    
    public void receiveCall(){
        System.out.println("Receive Call in Sub Class");
    }
}
