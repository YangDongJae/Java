import java.util.Scanner;
/**
 * Write a description of class Ex10430 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex10430
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int a;
        int b;
        int c;
        int d;
        
        a = (x + y)%z;
        b = ((x % z) + (y % z))%z;
        c = (x * y)%z;
        d = ((x % z) * (y % z))%z;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
    }
}
