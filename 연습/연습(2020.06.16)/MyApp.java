 import java.util.Scanner;
/**
 * Caculate use by Abstract Class
 *
 * @author (YangDongJae)
 * @version (2020.06.12)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();
        
        // if(s.equals("+")){
            // Add add = new Add();
            // add.setValue(a,b);
            // System.out.println(add.calculate());
        // }
        // else if(s.equals("-")){
            // Sub sub = new Sub();
            // sub.setValue(a,b);
            // System.out.println(sub.calculate());
        // }
        // else if(s.equals("*")){
            // Mul mul = new Mul();
            // mul.setValue(a,b);
            // System.out.println(mul.calculate());
        // }
        // else if(s.equals("/")){
            // Div div = new Div();
            // div.setValue(a,b);
            // System.out.println(div.calculate());
        // }
        // else{
            // System.out.println("please check your operation :)");
        // }
        Calc object;
        int result;
        switch(s){
            case "+": 
                    object = new Add();
                    object.setValue(a , b);
                    result = ((Add)object).calculate();
                    object = new Add(); break;
            
            case "-": object = new Sub(); break;
            case "*": object = new Mul(); break;
            case "/": object = new Div(); break;     
        }
    }
    
    System.out.println(result);
}
