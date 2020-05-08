import java.util.Scanner;
/**
 * Write a description of class Exception_Practice_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exception_Practice_2
{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("please add intiger");
        
        int sum = 0;
        int data = 0;
        
        for(int i = 0 ; i < 3 ; i ++){
            data = input.nextInt();
            sum += data;
        }
        
        System.out.println(sum);
    }
}
