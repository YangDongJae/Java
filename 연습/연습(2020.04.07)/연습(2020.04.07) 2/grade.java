import java.util.Scanner;
/**
 * Check Grade
 *
 * @author (Yang Dong Jae)
 * @version (2020.04.07 YangDong Jae)
 */
public class grade
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please write your score");
        int score = input.nextInt();

        if((score > 90) && (score <= 100)){
            System.out.println("A");
        }
        else if(score >80 && score < 90){
            System.out.println("B");
        }
        else if(score > 70 && score < 80){
            System.out.println("C");
        }
        else if(score > 60 && score < 70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

           
    }
}
