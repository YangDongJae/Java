import java.util.Scanner;
/**
 * Write a description of class Converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Converter
{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + " is changed to " + getDestString());
        System.out.print("please input " + getSrcString());
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("result of converting" + res + getDestString() + ".");
        scanner.close();
    }
}
