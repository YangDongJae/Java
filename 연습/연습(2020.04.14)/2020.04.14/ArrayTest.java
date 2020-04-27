
/**
 * Write a description of class ArrayTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTest
{
    public static void main(String[] args){
        //int[] i = new int[10];
        // i[0] = 4;
        // i[1] = 55;
        // i[2] = 32;
        // i[3] = 28;
        // i[4] = 35;
        // i[5] = 2;
        // i[6] = 99;
        // i[7] = 13;
        // i[8] = 43;
        // i[9] = 65;

        int[] i = {4, 55, 32, 28, 35, 2, 99, 13, 43, 65};
        int[] x;
        x = i;

        int s = 0;
        // for( int j = 0 ; j <= 9 ; j++  ){
        // s = s + x [j];
        // }

        for(int data : x ){
            s = s + data;
        }

        int[][] data = new int[2][3];

        int[][] y = { { 1,2,3 }, {4,5,6}};  //1ㅎㅐㅇ1ㅇㅕㄹㅇㅔ1 2 3 1ㅎㅐㅇ2ㅇㅕㄹㅇㅔ4 5 6
        System.out.println(y[0][2]);
        System.out.println(s);

        System.out.println(y[0][0] + y[0][1] + y[0][2]);

        //how can we do it with while , for , do while
    }
}