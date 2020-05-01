import java.util.Scanner;
/**
 * Write a description of class Year here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Year
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please write Years");
        int year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println("1");
        }
        else{     
            System.out.println("0");
        }
    }
}