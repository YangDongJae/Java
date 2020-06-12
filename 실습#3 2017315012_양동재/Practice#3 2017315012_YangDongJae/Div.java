
/**
 * Div Number a b
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class Div extends Calc
{
    public int a;
    public int b;
    
    
    public int calculate(){
        if ( b == 0 ){
            System.out.println("we can't do this");
        }
        return a / b;
    }
    
    public void setValue(int a , int b){
        this.a = a;
        this.b = b;
    }
}
