import java.util.Scanner;
/**
 * Write a description of class Ex3_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3_7
{
    public static void main(String[] args){
        int[] array = new int[5];
        int compare = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i++){
            int x = sc.nextInt();

            if(compare < x){
                compare = x;
            }

        }
        
        System.out.println(compare);
    }
}