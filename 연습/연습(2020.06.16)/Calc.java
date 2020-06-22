import java.util.Scanner;
/**
 * Abstract class Calc - Define Operation and run
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public abstract class Calc
{
    public int a;
    public int b;
    
    abstract public int calculate();
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
}
