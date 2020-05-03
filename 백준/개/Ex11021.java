import java.util.Scanner;
/**
 * Write a description of class Ex11021 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex11021
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("please write data case Number");
        int x = sc.nextInt();

        System.out.println("please write data Number for Sum");
        for (int i = 1 ; i <= x ; i ++){
            int y = sc.nextInt();
            int z = sc.nextInt();
            int result = y + z;

            System.out.println("Case #" + i + ": " + result);

            result = 0;

        }

    }
}
