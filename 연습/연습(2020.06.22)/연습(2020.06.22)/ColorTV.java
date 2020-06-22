
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
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printProperty()
    {
        System.out.println(getSize() + "inch" + this.color + "color");
    }
}
