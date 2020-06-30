
/**
 * Employee형 배열 선언 및 초기화 , 배열에 저장된 객체정보들의 정보 
 * 출력 및 급여 총합 계산 , 출력
 *
 * @author (2017315012 양동재)
 * @version (2020.06.30)
 */
public class Application
{
    /**
     * Employee형 배열 선언 및 초기화 
     * 배열에 저장된 객체정보들의 정보 출력 
     * 급여 총합 계산 , 출력
     *
     */
    public static void main(String[] args){

        Employee[] array = {new Professor("홍길동" , 20 , 16),
                new Professor("이순신" ,17 , 10 ),
                new Professor("강감찬", 31 , 31),
                new Staff("김유신", 50 ),
                new Staff("유관순", 12)};

        double totalPay = 0.0;

        for(Employee n: array){
            ((MyInterface.CanSpeak)n).say();
            totalPay += n.pay();
        }
        System.out.println("급여총합 = " + totalPay);
    }
}

