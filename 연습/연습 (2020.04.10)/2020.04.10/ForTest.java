
/**
 * Write a description of class ForTest here.
 *
 * @author (YangDongJae)
 * @version (2020.04.10)
 */
public class ForTest
{
    public static void main(String[] args){
        for(int x = 1 ; x <= 10 ; x ++ ){
            System.out.println(x);
        }

        int result = 0;
        for (int x = 1; x <= 10 ; x ++){
            result += x;
        }
        System.out.print(result);

        int result1 = 0 ;
        int x = 1;
        while(x <= 10){
            result1 += x;

            x = x + 1;

        }
        System.out.print(result1);
        
        int y = 1;
        int result2 = 0;
        do{
            result2 += y;
            y = y + 1;
        }while(y <= 10 );
    }
}