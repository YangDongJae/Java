
/**
 * Professor 속성값 초기화 , 추상메서드 overriding ,bonus method 정의 , say method implement , overriding
 *
 * @author (2017315012 양동재)
 * @version (2020.06.30)
 */
public class Professor extends Employee implements MyInterface.CanSpeak
{
    /**
     * 속성값 초기화
     * 
     * @parameter String name : prof.Name
     * @parameter int salary : prof.Salary
     * @parameter int officeHours : prof.Working Hours
     */
    
    Professor(String name , int salary , int officeHours){
        this.name = name;
        this.salary = salary;
        this.hoursWorked = officeHours;
    }
    
    /**
     * calculate bonus cash
     *
     * @return    result of calculate bonus cash
     */
    private double bonus()
    {
        return hoursWorked * 200;
    }

    /**
     * Calculate pay 
     *
     * @return    total pay (salary * hoursWorked + bonus)
     */
    public double pay()
    {
        return salary * hoursWorked + bonus();
    }

    /**
     * print prof pay
     *
     */
    public void say()
    {
        System.out.println(
            "<교수 : " + toString() + ", " 
            + pay() + ">");
    }

}
