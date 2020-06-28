import P.PrintInterface;
/**
 * Mul Operation  
 * 
 * @author (Yang Dong Jae) 
 * @version (2020.06.27)
 */
public class Mul extends Calc implements P.PrintInterface
{
    /**
     * Mul Method
     *  
     * @return      Result of Mul
     */  
    @Override
    public int calculate()
    {
        return a * b;
    }
    
    /**
     * Print Operator
     *  
     */   
    public void printOperator(){
        System.out.println(" * ");        
    }        
}