
/**
 * Write a description of class ColorTV here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorTV extends TV
{
    private int color;

    public ColorTV(int size , int color){
        super(size);
        this.color = color;
    }
    
    public int getColor(){
        return color;
    }
    
    public void printProperty (){
        System.out.println(getsize() + "inch" + color + "color");
    }
}
