
/**
 * Write a description of class HouseDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HouseDog extends Dog
{
    public void sleep(int hour) {
        System.out.println(this.name + "zzz in house for " + hour + "houurs");
    }
    
    public HouseDog(String name){
        this.setName(name);
    }
    
    public static void main(String args[]){
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name);
    }
}
