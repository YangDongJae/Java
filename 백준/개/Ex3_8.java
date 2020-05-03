import java.util.Scanner;
/**
 * Write a description of class Ex3_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3_8
{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("please fix array length field");
        int arrayLength = sc.nextInt();
        float result = 0;

        int[] array = new int[arrayLength];

        for(int i = 0 ; i < array.length ; i ++){
            System.out.println("please add Data to Array");
            
            array[i] = sc.nextInt();
            
            result += array[i];
        }
        
        result = result / array.length;
        
        System.out.println(result);
    }
}
