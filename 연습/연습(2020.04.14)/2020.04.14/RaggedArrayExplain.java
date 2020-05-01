/**
 * 실습#2 : 다음 그림과 같은 비정방형 배열을 만들어 값을 초기화하고 출력한 후에 각 행의 합을 구하여 출력하시오.
 *
 * @author (2017315012 Yang Dong Jae)
 * @version (2020.04.24 )
 */
public class RaggedArrayExplain
{
    /**
     * 배열을 생성
     * 
     * @return 초기화된 2차원 비정방형 배열
     */
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
     * @return    초기화하려는 배열
     */
    public static int[][] initArray(int[][] temp){
        for(int i = 0; i < temp.length; i++ )
            for(int j = 0; j < temp[i].length; j++ )
                temp[i][j]= (i+1)*10 + j;

        return temp;        
    }   

    /**
     * print array
     * 
     * @param array 출력하려는 배열
     * 
     */

    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++)
                System.out.print (array[i][j] + " ");
            System.out.println();

        }
    }

    /**
     * 1개의 행의 합을 구하는 메소드
     * 
     * @param array 합을 구하려고하는 1차원 배열
     * 
     * @return 1개의 행의 합
     */
    public static int sumArray(int [] array){
        int result = 0;
        for(int item: array){
            result += item;

        }
        return result;
    }

    /**
     *  nested for each statement
     */
    public static void totalSumArray(int[][] array){
        for(int stuff[]: array){
            //outer loop
            int result = 0;
            //inner loop
            for(int subStuff: stuff){
                result += subStuff;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args){
        int[][] raggedArray = makeArray();

        int[][] x = initArray(raggedArray);

        printArray(x);

        System.out.println("----------");

        for(int[] array:x){
            System.out.println(sumArray(array));
        }

    }
}
