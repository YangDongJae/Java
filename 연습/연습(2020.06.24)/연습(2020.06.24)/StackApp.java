import java.util.Scanner;
/**
 * Write a description of class StackAPp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringStack s;

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        s = new StringStack(sc.nextInt());

        while(true) {
            System.out.print("문자열 입력 >> ");
            String str = sc.next();

            if(str.equals("그만")) {
                break;
            }

            boolean result = s.push(str);
            if(result==false)
                System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int len = s.length();
        for(int i=0; i<(len); i++) {
            System.out.print(s.pop()+" ");
        }
    }
}

