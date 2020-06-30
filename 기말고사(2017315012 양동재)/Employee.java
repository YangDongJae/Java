
/**
 * 속성 선언 , pay 추상메서드 선언 , wrapper class toString method overriding
 *
 * @author (2017315012 양동재)
 * @version (2020.06.30)
 */
public abstract class Employee
{
    public String name;
    public int salary;
    public int hoursWorked;
    
    abstract public double pay();
    
    
    /**
     * overriding Wrapper class to String method.
     */
    public String toString(){
        return name;
    }
}
