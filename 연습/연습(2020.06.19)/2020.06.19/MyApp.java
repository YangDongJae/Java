import java.util.Scanner;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    /**
     * call draw method with referce object p
     *
     * @object class Name
     */
    static void paint(Shape p)
    {
        p.draw();
    }

    public static void main(String[] args){
        int breaker;
        Scanner sc = new Scanner(System.in);        
        System.out.println("start graphic editor beauty");

        do{
            System.out.println("insert (1) , Delete (2) , See history (3), End (4)");
            breaker = sc.nextInt();
            
            switch (breaker){
                case 1:
                    
                
            }
        }
        while(breaker < 4);

    }
}
