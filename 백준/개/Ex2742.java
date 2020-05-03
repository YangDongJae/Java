import java.util.Scanner;
/**
 * Write a description of class ex2741 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex2742
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("please write Number");
        int x = sc.nextInt();

        if (x <= 100000){
            for (int i = 0 ; i <= x - 1 ; i ++){
                System.out.println(x - i);
            }
        }
    }
}