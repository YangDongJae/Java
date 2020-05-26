
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        // construcrter = ㅅㅗㄱㅅㅓㅇㅇㅡㄹㅊㅗㄱㅣㅎㅗㅏㅎㅏㅁ
        // this = ㅈㅣㄱㅡㅁㅁㅏㄴㄷㅡㄹㅇㅓㅈㅣㄴㅡㄴㄱㅡㄱㅐㄱㅊㅔㄹㅡㄹㅊㅏㅁㅈㅗ
        this.width = width;
        this.height = height;
    }

    /**
     * for area of rectangle
     * 
     * @return area of rectangle
     */
    public double getArea()
    {
        return this.width * this.height;
    }
}
