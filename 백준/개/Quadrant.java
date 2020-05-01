import java.util.Scanner;
/**
 * Write a description of class Quadrant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadrant
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.println("please write x data");
        x = sc.nextInt();
        System.out.println("please write y data");
        y = sc.nextInt();

        if (x > 0 && y > 0){
            System.out.println("1");
        }
        else if (x > 0 && y < 0){
            System.out.println("4");
        }
        else if (x < 0 && y < 0){
            System.out.println("3");
        }
        else{
            System.out.println("2");
        }
    }
}