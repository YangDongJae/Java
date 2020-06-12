
/**
 * Write a description of class Km2Mile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Km2Mile extends Converter
{
    private double length;
    
    public Km2Mile(double length){
        this.length = length;
    }

    protected String getSrcString(){
        return "Km";
    }

    protected String getDestString(){
        return "Mile";
    }

    protected double convert(double src){
        return src / 1.6;
    }
}
