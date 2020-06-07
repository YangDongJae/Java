
/**
 * The Point
 *
 * @author (YangDongJae)
 * @version (2020.06.02)
 */
public class Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;


    public Point (){
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showPoint()
    {
        System.out.println("(" + this.x + " , " + this.y + ")");
    }

    /**
     * setting x , y Point
     *
     * @param  x  x Point of the Dot
     * @param  y  y Point of the Dot
     * 
     */
    public void set(int x , int y)
    {
        this.x = x;
        this.y = y;
    }
    
}
