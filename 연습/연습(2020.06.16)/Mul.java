
/**
 * Mul Number a b
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class Mul extends Calc implements PhoneInterface
{
    /**
     * 
     * Mul method
     * 
     * @return a * b
     */
    public int calculate(){
        return a * b;
    }
    
    
        public void sendCall(){
        System.out.println("start send Call in Mul Class");
    }
    
    public void receiveCall(){
        System.out.println("Receive Call in Mul Class");
    }
}
