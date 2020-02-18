import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class all {

    // умножение вектора на число
    public static void vectorByNum(int[] vect, int n) {
        int[] res = new int[vect.length];
        for (int i = 0; i < vect.length; ++i) {
            res[i] = vect[i] * n;
//            System.out.println(res[i]);
        }
    }

    // умножение вектора на вектор
    public static void vectorByVector(int[] vect1, int[] vect2) {
        int resVecByVec = 0;
        for (int i = 0; i < vect1.length; ++i) {
            resVecByVec += vect1[i]*vect2[i];
        }
//            System.out.println(resVecByVec);
    }

    // умножение матрицы на число
    public static void matrByNum(int[][] matr, int n) {
        int[][] resMatr = new int[matr.length][matr.length];
        for (int i = 0; i < matr.length; ++i) {
            for (int j = 0; j < matr.length; ++j) {
                resMatr[i][j] = matr[i][j] * n;
//                System.out.println(resMatr[i][j]);
            }
        }
    }

    // умножение матрицы на матрицу
    public static void matrByMatr(int[][] inMatr1, int[][] inMatr2) {
        int[][] resMatrByMatr = new int[inMatr1.length][inMatr1.length];
        for (int i = 0; i < inMatr1.length; ++i) {
            for (int j = 0; j < inMatr1.length; ++j) {
                for (int k = 0; k < inMatr1.length; ++k) {
                    resMatrByMatr[i][j] += inMatr1[i][k] * inMatr2[k][j];
                }
//                System.out.format("%6d ", resMatrByMatr[i][j]);
            }
//            System.out.println();
        }
    }

    // умножение матрицы на вектор
    public static void matrByVect(int[][] inMatr, int[] inVect) {
        int[] resMatrByVect = new int[inVect.length];
        for (int i = 0; i < inVect.length; ++i) {
            for (int j = 0; j < inVect.length; ++j) {
                resMatrByVect[i] += inMatr[j][i] * inVect[j];
            }
//            System.out.println("matr by vect: "+resMatrByVect[i]);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        // массив для умножения вектора на число
        int[] intArray = new int[1000000];
        int n = 3;
        //  заполняем массив
        for (int i = 0; i < intArray.length; ++i) {
            intArray[i] = rand.nextInt(1000);
        }

        // массивы для умножения вектора на вектор
        int[] intArray1 = new int[1000000];
        int[] intArray2 = new int[1000000];
        // заполняем массивы
        for (int i = 0; i < intArray1.length; ++i) {
            intArray1[i] = rand.nextInt(1000);
            intArray2[i] = rand.nextInt(1000);
        }

        // матрица для умножения на число
        int[][] intMatr = new int[1000][1000];
        int nn = 5;
        // аполнение матрицы
        for (int i = 0; i < intMatr.length; ++i) {
            for (int j = 0; j < intMatr.length; ++j) {
                intMatr[i][j] = rand.nextInt(1000);
            }
        }

        // матрица и вектор для перемножения
        int[] vect = new int[1000];
        int[][] matr = new int[1000][1000];
        // заполняем матрицу и вектор
        for (int i = 0; i < vect.length; ++i) {
            for (int j = 0; j < vect.length; ++j) {
                vect[j] = rand.nextInt(1000);
                matr[i][j] = rand.nextInt(1000);
            }
        }

        // матрицы для перемножения друг с другом
        int[][] matr1 = new int[1000][1000];
        int[][] matr2 = new int[1000][1000];
        // заполняем матрицы
        for (int i = 0; i < matr1.length; ++i) {
            for (int j = 0; j < matr1.length; ++j) {
                matr1[i][j] = rand.nextInt(1000);
                matr2[i][j] = rand.nextInt(1000);
            }
        }
//        int[][] mA =
//                {{33,34,12},
//                 {33,19,10},
//                 {12,14,17}};
//        int[][] mB =
//                {{10,11,34},
//                 {33,45,17},
//                 {45,63,12}};
//        int[] vector = new int[] { 1, 0, 1, 1 };
//        int[][] matrix = new int[][] {
//                { 1, 0, 0, 0 },
//                { 0, 1, 0, 0 },
//                { 0, 0, 1, 0 },
//                { 0, 0, 0, 1 }};

        //
        long m = System.currentTimeMillis();
//        vectorByNum(intArray, n);
//        vectorByVector(intArray1, intArray2);
//        matrByNum(intMatr, nn);
//        matrByVect(matr, vect);
        matrByMatr(matr1, matr2);
        System.out.println("time: "+ (System.currentTimeMillis() - m) + " milliseconds");
    }
}