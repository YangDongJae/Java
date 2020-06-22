
/**
 * Write a description of class Won2Dollar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Won2Dollar extends Converter
{
    private String src;
    private String dest;
    private int exchangeRate;
    
    Won2Dollar(int exchangeRate){
        this.exchangeRate= exchangeRate;
    }

    protected double convert(double src){
        src = src / exchangeRate;
        
        return src;
    }

    protected String getSrcString(){
        this.src = "won";
        return src;
    }

    protected String getDestString(){
        this.dest = "dollar";
        return dest;
    }
}
