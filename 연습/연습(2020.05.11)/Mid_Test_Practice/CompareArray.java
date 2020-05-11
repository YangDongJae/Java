import java.util.Scanner;
/**
 * Compare 2dimesion array
 *
 * @author (2017315012 YangDongJae)
 * @version (2020.05.11)
 */
public class CompareArray
{
    public static int[][] makeArray(){
        int array[][];

        System.out.println("how many get the data for first array?");
        Scanner sc = new Scanner (System.in);
        try {
            int x = sc.nextInt() + 1;
            array = new int[x][];
        }
        catch(java.util.InputMismatchException e){
            System.out.println("that is not Number please retry with Numebr");
            array = new int[0][0];
            System.exit(0);
        }

        for(int i = 0; i < 3 ; i ++){
            System.out.println("how many have " + (i + 1) + " array Data ?");
            int y = sc.nextInt();
            array = new int [i + 1][y];
        }
        return array;
    }

    public static int[][] add_data(int[][] array){
        // for(int[] x : data_array){
        // for(int y : x){
        // System.out.println("what's the data for the Array?");
        // Scanner sc = new Scanner (System.in);
        // int z = sc.nextInt();
        // y = z;
        // }
        // System.out.println(data_array);
        // }
        // return array;
        for(int i = 0 ; i < array.length ; i ++){
            for(int j = 0 ; j < array[i].length ; j ++){
                System.out.println("What's the data for the Array?");
                Scanner sc = new Scanner(System.in);
                int z = sc.nextInt();
                array[i][j] = z;
            }
            System.out.println(array[i]);

        }
        return array;
    }

    public static void print_array(int[][] array){
        for(int[] x : array){
            for(int y : x){
                System.out.print (y + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        print_array(add_data(makeArray()));
    }
}