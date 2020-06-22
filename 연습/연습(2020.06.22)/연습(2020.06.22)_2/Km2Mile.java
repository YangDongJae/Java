
/**
 * Write a description of class Km2Mile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Km2Mile extends Converter
{
    private double exchangeRate;
    private String src;
    private String dest;

    Km2Mile(double exchangeRate){
        this.exchangeRate = exchangeRate;       
    }

    protected double convert(double src){
        src = src / exchangeRate;

        return src;
    }

    protected String getSrcString(){
        this.src = "KM ";
        return src;
    }

    protected String getDestString(){
        this.dest = " Miles";
        return dest;
    }
}
