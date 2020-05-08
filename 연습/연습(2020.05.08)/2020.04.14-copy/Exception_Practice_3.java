
/**
 * Write a description of class Exception_Practice_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exception_Practice_3
{
    public static void main(String[] args){
        String[] array = {"23", "12" , "3.141592" , "90"};

        for(int i = 0 ; i < array.length ; i++ ){
            try{int temp = Integer.parseInt(array[i]);
            }
            catch(NumberFormatException e){
                System.out.println("Type error. please change String formant to Integer");

            }

        }
    }
}