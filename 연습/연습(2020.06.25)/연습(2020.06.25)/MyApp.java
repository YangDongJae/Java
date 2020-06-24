
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){
        Dictionary dic = new Dictionary(10);
        dic.put("Hwang" , "Java");
        dic.put("Kim" , "Python");        
        dic.put("Yang" , "R");      
        
        System.out.println("Hwang is " + dic.get("Hwang"));
        System.out.println("Kim is " + dic.get("Kim"));
        System.out.println("Yang is " + dic.get("Yang")); 
        
        dic.delete("Hwang");
        System.out.println("Hwang is " + dic.get("Hwang"));
        dic.getArray();
    }
}
