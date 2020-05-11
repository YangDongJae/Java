import java.util.Scanner;
/**
 * Write a description of class MyCaculator here.
 *
 * @author (YangDongJae)
 * @version (2020.04.10)
 */
public class MyCaculator
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String breaker;
        float a;
        float b;

        System.out.print("계산식>>");

        a = sc.nextFloat();
        breaker = sc.next();
        b = sc.nextFloat();

        switch (breaker){
            case ("+"):
            System.out.print(a + b);
            break;

            case ("-"):
            System.out.print(a - b);
            break;

            case ("*"):
            System.out.print(a * b);
            break;
            case ("/"):
            if (b == 0) {
                System.out.print("we can't do it");
                break;
            }
            System.out.print(a / b);
            break;
            default :
            System.out.print("we can't do it");

        }
    }
}