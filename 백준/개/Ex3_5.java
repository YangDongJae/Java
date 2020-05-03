import java.util.Scanner;
/**
 * Write a description of class Ex3_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3_5
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("please write five intiger Numebr");
        int result = 0;
        int[] array = new int[5];

        for(int i = 0 ; i < 5 ; i ++){
            int x = sc.nextInt();
            if(x >= 0){
                result += x;
            }
            else{
                continue;
            }

            System.out.println(result);
        }
    }
}