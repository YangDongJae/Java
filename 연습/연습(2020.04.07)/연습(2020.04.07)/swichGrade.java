import java.util.Scanner;
/**
 * Grade class use swtich
 *
 * @author (YangDongJae)
 * @version (YangDongJae 2020.04.07)
 */
public class swichGrade
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please write your score");
        int score = input.nextInt();

        switch(score / 10){
            case 10 :
            case 9 :
            System.out.println("A");
            break;
            case 8 :
            System.out.println("B");
            case 7 :
            System.out.println("C");
            case 6 :
            System.out.println("D");                
            default:
            System.out.println("F");
            //break;

        }
    }
}
