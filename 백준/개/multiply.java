import java.util.Scanner;
/**
 * Write a description of class multiply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class multiply
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("please write for multiply");
        x = sc.nextInt();

        for(int i = 1 ; i < 10 ; i++ ){
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
