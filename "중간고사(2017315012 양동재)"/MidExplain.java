
/**
 * Sunmoon Univ PBL Mid Test Figure work Array
 *
 * @author (2017315012 양동재)
 * @version (2020.05.12)
 */
public class MidExplain
{

    public static void main (String args[]){
        int[][] raggedArray;
        raggedArray = makeArray();
        int longestRowLength = findLongestRowLength(raggedArray);
        calculateArray(raggedArray, longestRowLength);
    }

    /**
     * 배열의 선언 ,초기화 , 참조
     * 
     * @return 정수형 데이터가 참조된 2차원 비정방형 배열
     */
    public static int[][] makeArray(){
        int[][] raggedArray = {{78,48,78,98} , {99,92} , {29,64,83} , {34,78,92,56}};

        return raggedArray;
    }

    /**
     * 가장 긴 열 길이를 갖는 행 찾기
     * 
     * @return 가장 긴 열 길이를 갖는 행
     */
    public static int findLongestRowLength(int[][] raggedArray){
        int longestRowLength = raggedArray[0].length;
        for(int[] x:raggedArray){
            if (longestRowLength < x.length){
                longestRowLength = x.length;
            }
        }
        return longestRowLength;
    }

    /**
     * 각 열의 합과 평균을 구하고 출력
     */
    public static void calculateArray(int[][] array, int row){
        int j = 0;
        if(j < row){
            double avarage = 0.0;
            for (int i = 0 ; i < array.length ; i++){
                int sum = 0;
                int n = 0;
                do{
                    sum += array[i][n];
                    n ++;
                }
                while(n < array[i].length);
                avarage = sum / n ;

                System.out.println ((i + 1) +"번째 열 : 합 = " + sum + "\t 평균 = " + avarage);
            }
        }
    }
}