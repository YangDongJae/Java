import java.util.Scanner;
/**
 * test for input System.
 *
 * @author (YangDongJae)
 * @version (YangDongJae 2017315012)
 */
public class InputTest

{ 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("write your school ID");
        
        String studentId = scanner.next();
        
        System.out.println(studentId);
        
    }
}
