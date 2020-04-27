
/**
 * Write a description of class Hello here.
 *
 * @author (2017315012 Yang Dong Jae)
 * @version (2020.03.27)
 */
public class Hello
{
    public static void main(String[] args){
        int i = 20;
        int s;
        char a;
        
        s = sum(i ,10);
        a = '?';
        System.out.println(a);
        System.out.println("hello world");
        System.out.println(s);
    }
    
    public static int sum(int n, int m){
        return n + m;
    }
}
