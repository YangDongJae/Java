import P.PrintInterface;
/**
 * Sub Operation  
 * 
 * @author (Yang Dong Jae) 
 * @version (2020.06.27)
 */
public class Sub extends Calc implements PrintInterface
{
    /**
     * Sub Method
     *  
     * @return      result of Sub
     */    
    @Override
    public int calculate()
    {
        return a - b;
    }
    
    /**
     * Print Operator
     *  
     */   
    @Override
    public void printOperator(){
        System.out.println(" - ");        
    }    
}