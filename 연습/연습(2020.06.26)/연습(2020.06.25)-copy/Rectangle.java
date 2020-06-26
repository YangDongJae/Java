import Interface.MyInterface;

/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Figure //implements Interface.MyInterface
{
    private int h;
    private int w;
   
    public String toString(){
        return "h = "+ this.h + "w = " + this.w;
    }
}
