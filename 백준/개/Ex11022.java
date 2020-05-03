import java.util.Scanner;
/**
 * Write a description of class Ex11022 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex11022
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        for (int i = 1 ; i <= x ; i++){
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int result = y + z;
            
            System.out.println("Case #" +i+": " + y + " + " + z + " = " + result);
        }
    }
}
