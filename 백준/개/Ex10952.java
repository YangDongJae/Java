import java.util.Scanner;
/**
 * Write a description of class Ex10952 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex10952
{
    // public static void main(String[] args){
        // Scanner sc = new Scanner (System.in);

        // do{
            // int x = sc.nextInt();
            // int y = sc.nextInt();

            // System.out.println(x + y);

        // } while( x != 0 && y != 0);
    // }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        do{
            System.out.println(x + y);
            
            x = sc.nextInt();
            y = sc.nextInt();
        } while( x != 0 && y != 0);
    }
}