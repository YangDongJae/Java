import P.PrintInterface;
/**
 * Div Operation
 * 
 * @author (Yang Dong Jae) 
 * @version (2020.06.27)
 */
public class Div extends Calc implements PrintInterface
{
    /**
     * Div Method
     *  
     * @return      result of Div
     */
    @Override
    public int calculate()
    {
        return a / b;
    }
    
     /**
     * Print Operator
     *  
     */   
    @Override
    public void printOperator(){
        System.out.println(" / ");        
    }        
}