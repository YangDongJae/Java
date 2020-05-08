
/**
 * Write a description of class Exception_Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exception_Practice
{
    public static void main(String[] args){
        int[] array = new int[5];
        array[0] = 0;
        try{
            for(int i = 0 ; i < 5 ; i ++){
                array[i + 1] = i + 1 + array[i];
                System.out.println(array[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Please edit array range ");
        }

        finally{
            System.out.println("The programe is exist");
        }

    }
}
