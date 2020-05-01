import java.util.Scanner;
/**
 * Write a description of class QuickSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuickSum
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please write data case");
        
        int count = sc.nextInt();
        System.out.println("please write data Num");
        int a = 0;
        int b = 0;
        int [] result = new int[count];
        for(int i=0; i<count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            result[i] = a+b;
        }

        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}