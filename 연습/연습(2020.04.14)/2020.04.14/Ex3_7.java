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
        System.out.println("please write Positive Num.");
        Scanner scan = new Scanner(System.in);

        int[] data = new int[5];

        for(int i = 0; i <= data.length - 1 ; i++ ){
            data[i] = scan.nextInt();
        }

        //int i = 0;
        //int large = data[i];

        // while(i <= 4) {
            // if(data[i + 1] > data[i]){
                // large = data[i + 1];
            // }
            // else {
                // large = data[i];
            // }
        // }
        
        int i = 0;
        int large = 0;
        while (i <= data.length - 1){
            if(large < data[i]){
                large = data[i];
            }
            i = i + 1;
        }
        

        System.out.println("capital number is" + large);
    }
}
