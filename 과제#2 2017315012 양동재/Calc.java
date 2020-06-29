
/**
 * Abstract Class Calc - Setting Value for Calculate
 * 
 * @author (Yang Dong Jae)
 * @version (2020.06.27)
 */
public abstract class Calc
{
    int a;
    int b;

    public abstract int calculate();

    /**
     * Set Property
     *  
     */    
    public void setValue(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}
