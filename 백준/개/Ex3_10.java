import java.util.Scanner;
/**
 * Write a description of class Ex3_10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ex3_10
{
    public static int[][] resetArray(){
        Scanner sc = new Scanner (System.in);

        System.out.println("please add total Grade");
        int x = sc.nextInt();

        int[][] scoreArray = new int[x][];

        for (int i = 0 ; i < x ; i++){
            System.out.println("how many class in" + (i+1) + " grade?");
            int y = sc.nextInt();

            scoreArray[i] = new int[y];
        }

        return scoreArray;
    }

    public static int[][] scoreArray(int[][] resetArray){
        Scanner sc = new Scanner(System.in);

        int x = 1;
        for(int i = 0 ; i < resetArray.length ; i ++){
            // for(int classes:resetArray[i]){
            // System.out.println("please add "+ (i + 1) + "grade" 
            // + x +"classes avarage score each classes");

            // int score = sc.nextInt();

            // classes = score;
            // x += 1;
            // }
            // x = 1;
            for (int j = 0 ; j < resetArray[i].length; j ++){
                System.out.println("please add "+ (i + 1) + "grade" 
                    + x +"classes avarage score each classes");

                int score = sc.nextInt();

                resetArray[i][j] = score;

                x += 1;
            }

            x = 1;
        }
        return resetArray;
    }

    public static int[] avarageArray(int[][] scoreArray){
        int[] avarageScore = new int[scoreArray.length];
        int totalScore = 0;

        for(int i = 0 ; i < scoreArray.length ; i ++){
            for(int classes : scoreArray[i]){
                totalScore += classes;
            }
            avarageScore[i] = totalScore / scoreArray[i].length;

            totalScore = 0;
        }
        return avarageScore;
    }

    public static void printArray(int[] avarageArray){
        for(int i = 0 ; i < avarageArray.length ; i ++){
            System.out.println((i + 1) + " Grade Avarage Score is " + avarageArray[i]);
        }
    }

    public static void main(String[] args){
        printArray((avarageArray(scoreArray(resetArray()))));
    }
}