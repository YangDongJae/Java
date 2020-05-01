import java.util.Scanner;
/**
 * Write a description of class Caculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caculate
{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int caseNum;
        int dataNum_a;
        int dataNum_b;
        System.out.println("please write test case number");
        caseNum = sc.nextInt();
        System.out.println("please write test data A and B");
        dataNum_a = sc.nextInt();
        dataNum_b = sc.nextInt();
        for(int i = 0 ; i <= caseNum ; i ++){
            System.out.println(dataNum_a + dataNum_b);

            dataNum_a = sc.nextInt();
            dataNum_b = sc.nextInt();

        }
    }
}