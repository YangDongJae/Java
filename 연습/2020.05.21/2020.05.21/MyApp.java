
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main (String[] args){
        Rectangle rectangl1 = new Rectangle(2.12, 3.42);
        Rectangle rectangl2 = new Rectangle(2.0, 1.0);        
        Rectangle rectangl3 = new Rectangle(10.0, 9.0); 
        
        System.out.println(rectangl1.getArea() + rectangl2.getArea() + rectangl3.getArea());
      
    }
}
