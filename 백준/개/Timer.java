;import java.util.Scanner;
/**
 * Write a description of class Timer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Timer
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h;
        int m;

        System.out.println("please add Hour");
        h = sc.nextInt();
        System.out.println("please add Minuate");
        m = sc.nextInt();

        if(h <= 23 && h >= 0){
            if(m >= 0 && m <= 59){
                if( m - 45 < 0 && h != 0){
                    h = h - 1;
                    m = m + 60 - 45;

                    System.out.println(h + " " + m);
                }
                else if( m - 45 > 0){
                    m = m - 45 ;

                    System.out.println(h + " " + m);
                }
                else if ( h == 0 && m - 45 < 0) {
                    h = 23;
                    m = m + 60 - 45;
                    
                    System.out.println(h + " " + m);
                }
            }
        }
    }
}
