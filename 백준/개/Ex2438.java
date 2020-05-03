import java.util.Scanner;
/**
 * Write a description of class Ex2438 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex2438
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        String result = new String ("*");
        
        for(int i = 0 ; i <= x - 1; i++){
            System.out.println(result);
            
            result = result + "*";
        }
        
    }
}
