import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class all {
    ArrayList<Integer> myVect = new ArrayList<>();


    public int vectorToNum(ArrayList<Integer> vect) {
        return 0;
    }

    public static void main(String[] args) {
        int n = 3;
        Random rand = new Random();
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length;i++) {
            intArray[i] = rand.nextInt(1000);
//            System.out.println(intArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] * n);
        }
        System.out.println("test");
    }
}