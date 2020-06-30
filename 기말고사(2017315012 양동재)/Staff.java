
/**
 * Staff속성값 초기화 pay method overriding , say method impelement , overriding 
 *
 * @author (2017315012 양동재)
 * @version (2020.06.30)
 */
public class Staff extends Employee implements MyInterface.CanSpeak
{
    /**
     * Staff속성값 초기화 , hoursWorked 80 으로 정의
     * 
     * @parameter String name : Staff name
     * @parameter int Salary : Staff Salary
     */
    Staff(String name , int salary){
        this.name = name;
        this.salary = salary;
        this.hoursWorked = 80;
    }

    /**
     * calculate for Staff pay
     *
     * @return    Staff pay ( salary * hoursWorked + 80 )
     */
    public double pay(){
        {
            return salary * hoursWorked + 80;
        }
    }

    /**
     * print staff pay
     *
     */
    public void say()
    {
        System.out.println(
            "<직원 : " + toString() + ", " 
            + pay() + ">");
    }
}
