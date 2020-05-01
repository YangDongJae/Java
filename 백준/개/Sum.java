import java.util.Scanner;
/**
 * Write a description of class Sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please write Sum data Number");
        int x = sc.nextInt();
        int result = 0;
        for (int i = 1 ; i <= x ; i ++){
            result += i;
        }
        System.out.println(result);
    }
}