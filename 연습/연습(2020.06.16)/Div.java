
/**
 * Div Number a b
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class Div extends Calc implements PhoneInterface
{
    public int calculate(){
        return a / b;
    }
    
    
        public void sendCall(){
        System.out.println("start send Call in Div Class");
    }
    
    public void receiveCall(){
        System.out.println("Receive Call in Div Class");
    }
}
