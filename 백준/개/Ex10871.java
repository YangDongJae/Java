import java.util.Scanner;
/**
 * Write a description of class Ex10871 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex10871
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please write data X and Y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] z = new int[x];
        System.out.println("please write Data of X");
        if(1 <= x && x <= 10000){
            for(int i = 0; i < z.length; i++){
                z[i] = sc.nextInt();
            }

            for (int j = 0; j <z.length; j++){
                if(z[j] < y){
                    System.out.print(z[j]);
                }
            }

        }
    }
}
