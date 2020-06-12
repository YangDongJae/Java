import java.util.Scanner;
/**
 * Write a description of class Won2Dollar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Won2Dollar extends Converter{

    private int pay;

    public Won2Dollar(int pay){
        this.pay = pay;
    }

    protected String getSrcString(){
        return "won";
    }

    protected String getDestString(){
        return "dollars";
    }

    protected double convert(double src){
        return src / pay;
    }
}
