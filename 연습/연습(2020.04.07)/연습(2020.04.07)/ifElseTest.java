import java.util.Scanner;
/**
 * IF Else Test
 *
 * @author (Yang Dong Jae)
 * @version (2020.04.07 Yang Dong Jae )
 */
public class ifElseTest
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write number");
        int n = scanner.nextInt();
        if( n % 3 == 0){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
    }
}