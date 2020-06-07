;/**
 * Write a description of class ColorPoint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorPoint extends Point
{
    // instance variables - replace the example below with your own
    private String color;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void setClolor(String color)
    {
        this.color = color;
    }
    
    public ColorPoint(int x ,int y , String color){
        super(x, y);
        
        this.color = color;
        
    }
    
    public void showColorPoint(){
        System.out.print(this.color);
        this.showPoint();
    }
}
