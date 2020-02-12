import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class all {
    public static int n = 3;

    public static void vectorToNum(int[] vect) {
        for (int i = 0; i < vect.length; ++i) {
            System.out.println(vect[i] * n);
        }
    }

    public static void vectorToVector(int[] vect1, int[] vect2) {
        int[] res = new int[vect1.length];
        for (int i = 0; i < vect1.length; ++i) {
            res[i] = vect1[i]*vect2[i];
            System.out.println(res[i]);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArray = new int[100];
        int[] intArray1 = new int[100];
        int[] intArray2 = new int[100];
        for (int i = 0; i < intArray.length;i++) {
            intArray[i] = rand.nextInt(1000);
            intArray1[i] = rand.nextInt(1000);
            intArray2[i] = rand.nextInt(1000);
//            System.out.println(intArray[i]);
        }
//        vectorToNum(intArray);
        vectorToVector(intArray1, intArray2);
    }
}