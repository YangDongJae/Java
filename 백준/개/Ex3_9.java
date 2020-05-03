import java.util.Scanner;
/**
 * Write a description of class Ex3_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3_9
{
    public static int sumArray(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int result = 0;
        int[] array = new int[x];
        
        for (int j = 0 ; j < x ; j ++){
            array[j] = sc.nextInt();
        }
        
        for(int i:array){
            result += i;
        }
        
        return result;
    }
    
    public static void fruitArray(){
        Scanner sc = new Scanner (System.in);
        System.out.println("please fix the array length");
        int x = sc.nextInt();
       
        String[] array = new String[x];
        
        for(int i = 0 ; i < x ; i ++){
            System.out.println("please add" + i +" fruit Data");
            array[i] = sc.next();
        }
        
        for(String j : array){
            System.out.print(j);
        }
    }
    
    public static void dayOfTheWeek(){
        Scanner sc = new Scanner (System.in);
        System.out.println("please fix the array length");
        int x = sc.nextInt();
        
        String[] WeekData = new String[x];
        
        for(int i = 0 ; i < x ; i ++){
            System.out.println("please add" + i + " day of the Week Data");
            WeekData[i] = sc.next();
        }
        
        for(String k : WeekData){
            System.out.print(k + " ");
        }
    }
    
    public static void main(String[] args){
        dayOfTheWeek();
        fruitArray();
    }
}
