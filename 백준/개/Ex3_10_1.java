import java.util.Scanner;

public class Ex3_10_1
{
    public static int[] userData() {
        Scanner sc = new Scanner (System.in);
        int[] userData = new int [2];
        System.out.println("please write your grade");

        int grade = sc.nextInt();

        System.out.println("please write your total Semaster");

        int semaster = sc.nextInt();

        userData[0] = grade;
        userData[1] = semaster;

        return userData;
    }

    public static float[][] makeArray(int[] userData) {
        float[][] gradeData = new float[userData[0]][];
        int i;

        if(userData[1] % 2 == 0){
            // for(float[] k : gradeData){
            // k = new float[2];
            // }

            for( i = 0 ; i < userData[0] ; i ++){
                gradeData[i] = new float [2];
            }
        }
        else{
            for( i = 0 ; i < userData[0] - 1 ; i ++){
                gradeData[i] = new float [2];
            }
            gradeData[i] = new float[1];
        }
        return gradeData;
    }

    public static float[][] addData(float[][] gradeData){
        Scanner sc = new Scanner (System.in);
        for(int i = 0 ; i < gradeData.length ; i++){
            for(int j = 0 ; j < gradeData[i].length ; j ++){
                System.out.println("what is your avarage grade score at " + (i + 1) +
                    " grade " + (j + 1 ) + " semaster?");
                float avarageScore = sc.nextFloat();

                gradeData[i][j] = avarageScore;
            }
        }

        return gradeData;
    }

    public static float caculate(float[][] avarageData){
        float result = 0;
        int count = 0;

        for(float totalAvarage[]: avarageData){
            for (float gradeAvarage : totalAvarage){
                result += gradeAvarage;
                count ++;
            }
        }

        result = result / count;

        return result;
    }

    public static void main(String[] args){
        System.out.println(caculate(addData(makeArray(userData()))));
    }
}
