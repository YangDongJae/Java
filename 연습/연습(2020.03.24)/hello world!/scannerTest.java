import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) {
        String city1;
        String city2;
        String city3;
        String city4;
        int num1;
        int num2;
        //변수 선언문 ( 자료타입 + 변수 이름)

        Scanner sc = new Scanner(System.in);
        //scanner 클래스에서 객체 생성
        System.out.println("도시의 이름을 입력하세요");
        city1 = sc.next();
        System.out.println("도시의 이름을 입력하세요");
        city2 = sc.next();
        System.out.println("도시의 이름을 입력하세요");
        city3 = sc.next();
        System.out.println("도시의 이름을 입력하세요");
        city4 = sc.next();
        System.out.println("숫자를 입력하세요");
        num1 = sc.nextInt();
        System.out.println("숫자를 입력하세요");
        num2 = sc.nextInt();

        System.out.println("도시의 이름들은 "+city1+","+city2+","+city3+","+city4+"이고 입력한 숫자의 값은"+num1+","+num2+"입니다.");
    }   
}