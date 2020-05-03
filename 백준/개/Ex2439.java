import java.util.Scanner;
/**
 * Write a description of class Ex2439 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex2439
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();

        for(int i = 0 ; i < x ; i ++){
            for(int j = i+1 ; j < x; j++){
                System.out.print(" ");
            }
            for(int k = x - i ; k <= x ; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}