
/**
 * Write a description of class Ex3_11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3_11
{
    public static int[][] resetArray (){
        int[][] array = new int [4][];

        for(int i = 0 ; i < 4 ; i ++){
            if(i % 2 == 0){
                array[i] = new int [3];
            }
            else{
                array[i] = new int[2];
            }
        }
        return array;
    }

    public static int[][] addData(int[][] array){
        // for (int i = 1 ; i <= array.length ; i ++){
            // for(int j = 0 ; j < array[i].length ; j ++){
                // array[i - 1][j] = (i * 10) + j;
            // }
        // }
        
        for (int i = 0 ; i < array.length ; i ++){
            for(int j = 0 ; j < array[i].length ; j ++){
                array[i][j] = ((i + 1) * 10) + j;
            }
        }
        return array;
    }
    
    public static void main(String[] args){
        for(int[] colum : addData(resetArray())){
            for(int k : colum){
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
    }
}
