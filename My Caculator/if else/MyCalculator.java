import java.util.Scanner;
/**
 * Assigment#1 MyCalculator software
 *
 * @author (2017315012 양동재)
 * @version (2020.04.09)
 */
public class MyCalculator
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
        
        int i_a;
        int i_b;
        int i_result_p;
        int i_result_m;
        int i_result_mu;
        int i_result_d;
        
        i_a = (int)a;
        i_b = (int)b;
        
        i_result_p = (int) i_a + i_b;
        i_result_m = (int) i_a - i_b;
        i_result_mu = (int) i_a * i_b;
      
       
       
        
        
        

        if(breaker.equals("+")){
            System.out.println(""+i_a+" " + breaker +" "+i_b +"의 계산결과는" +" " +(i_result_p));
        }
        else if(breaker.equals("-")){
            System.out.print(""+i_a+" " + breaker +" "+i_b +"의 계산결과는" +" " +(i_result_m));
        }
        else if(breaker.equals("*")){
            System.out.print(""+i_a+" " + breaker +" "+i_b +"의 계산결과는" +" " +(i_result_mu));
        }
        else if((breaker.equals("/")) && (b != 0)){
            System.out.print(""+i_a+" " + breaker +" "+i_b +"의 계산결과는" +" " +(a / b));
        }
        else if(b == 0){
            System.out.println("“0으로 나눌 수 없습니다!”");
        }
        else{
            System.out.println("잘못된 수식을 입력하였습니다.");
        }
    }
}
