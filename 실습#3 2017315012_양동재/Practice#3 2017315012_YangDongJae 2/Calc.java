import java.util.Scanner;
/**
 * Abstract class Calc - Define abstract method and run method
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public abstract class Calc
{
    abstract public int calculate();
    abstract public void setValue(int a, int b);
    
    public void run(){
        System.out.println(calculate());
    }
}
