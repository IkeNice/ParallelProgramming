import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class all {

    // умножение вектора на число
    public static void vectorByNum(int[] vect, int n) {
        int[] res = new int[vect.length];
        for (int i = 0; i < vect.length; ++i) {
            res[i] = vect[i] * n;
            System.out.println(res[i]);
        }
    }

    // умножение вектора на вектор
    public static void vectorByVector(int[] vect1, int[] vect2) {
        int[] res = new int[vect1.length];
        for (int i = 0; i < vect1.length; ++i) {
            res[i] = vect1[i]*vect2[i];
//            System.out.println(res[i]);
        }
    }

    // умножение матрицы на число
    public static void matrByNum(int[][] matr, int n) {
        int[][] resMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; ++i) {
            for (int j = 0; j < matr.length; ++j) {
                resMatr[i][j] = matr[i][j] * n;
                System.out.println(resMatr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        // массив для умножения вектора на число
        int[] intArray = new int[100];
        int n = 3;
        // массивы для умножения вектора на вектор
        int[] intArray1 = new int[100];
        int[] intArray2 = new int[100];

        for (int i = 0; i < intArray.length; ++i) {
            intArray[i] = rand.nextInt(1000);

            intArray1[i] = rand.nextInt(1000);
            intArray2[i] = rand.nextInt(1000);
        }
//        vectorByNum(intArray, n);
//        vectorByVector(intArray1, intArray2);

        // матрица для умножения на число
        int[][] intMatr = new int[100][100];
        int nn = 5;
        int len = intMatr.length;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j) {
                intMatr[i][j] = rand.nextInt(1000);
            }
        }
        matrByNum(intMatr, nn);
    }
}