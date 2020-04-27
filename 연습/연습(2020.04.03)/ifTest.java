import java.util.Scanner;
/**
 * Write a description of class ifTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ifTest
{
    public static void main(String[] args){
        System.out.println("please chat your score");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        
        if(score >= 80){
            System.out.println("Congratulations. Pass.");
            }
        }
    }       