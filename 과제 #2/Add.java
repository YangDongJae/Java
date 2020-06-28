import P.PrintInterface;
/**
 * Add Operation  
 * 
 * @author (Yang Dong Jae) 
 * @version (2020.06.27)
 */
public class Add extends Calc implements PrintInterface
{
    /**
     * sum Method
     *  
     * @return      result of Sum
     */    
    @Override
    public int calculate()
    {
        return a + b;
    }

    /**
     * Print Operator
     *  
     */    
    @Override
    public void printOperator(){

    }

}
