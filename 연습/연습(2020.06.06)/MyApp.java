
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        Student s = new Student();
        Person p;
        
        p = s; // upcasting , upcasting is automatically 
        
        System.out.println(p.name);
        
        System.out.println(s.age);
    }
}
