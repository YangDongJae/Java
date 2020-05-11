
/**
 * RaggedArray Class
 *
 * @author (2017315012 양동재)
 * @version (2020.04.21)
 */
public class RaggedArrayTest
{
    public static int[][] makeArray(){
        int[][] raggedArray = new int [4][];
        raggedArray[0] = new int [3];
        raggedArray[1] = new int[2];
        raggedArray[2] = new int [3];
        raggedArray[3] = new int [2];

        return raggedArray;
    }

    /**
     * reset array
     *
     * @param  temp  array for reset
     * @return    초기화된 2차원 비정방형 배열 
     */
    public static int[][] initArray(int[][] temp){
        for(int i = 0; i < temp.length; i++ )
            for(int j = 0; j < temp[i].length; j++ )
                temp[i][j]= (i+1)*10 + j;

        return temp;        
    }   

    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++)
                System.out.print (array[i][j] + " ");
            System.out.println();    
        }
    }    

    public static int SumArray(int[][] stuffArray){
        int sum = 0;
        for (int[] x: stuffArray){
            for(int y:x){
                sum = sum + y;
            }

        }
        return sum;        
    }

    public static void main(String[] args){
        int[][] raggedArray = makeArray();

        int[][] x = initArray(raggedArray);

        printArray(raggedArray);

        SumArray(raggedArray);
    }
}