
/**
 * Mul Number a b
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class Mul extends Calc
{
    public int a;
    public int b;
    
    
    public int calculate(){
        return a * b;
    }
    
    public void setValue(int a , int b){
        this.a = a;
        this.b = b;
    }
}
