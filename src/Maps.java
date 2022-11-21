import java.util.Arrays;

/**
 * Учитывая массив целых чисел, верните новый массив с удвоением каждого значения.
 * Например:
 * [1, 2, 3] --> [2, 4, 6]
 */

public class Maps {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(map(new int[]{1, 2, 3})));
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        }
        return arr;
    }
}