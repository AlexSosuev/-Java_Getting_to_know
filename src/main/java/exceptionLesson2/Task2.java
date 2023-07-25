package exceptionLesson2;

import java.util.Arrays;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "1", "1", "1", "1"}
        };

        String[][] arr = new String[][]{
                {"1", "1"},
                {"1", "1", "1", "1", "1"},
                {"1", "2"},
                {"3", "3"},
                {"2", "6"}
        };
        //sum2d(arr0);

//        fillArray(arr, 5);
//        System.out.println(Arrays.deepToString(arr));
        sum2d(arr);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            fillArray(arr, arr.length);
            System.err.println("Catch");
        } catch (NumberFormatException e) {
            System.err.println("Низя вводит не циферки");
            System.exit(1);
        }
        return sum;
    }

    private static String[][] fillArray(String[][] useMatrix, int length) {
        for (int i = 0; i < length; i++) {
            String[] current = useMatrix[i];
            if (current.length < length) {
                String[] temp = new String[length];
                System.arraycopy(current, 0, temp, 0, current.length);
                for (int j = current.length; j < length; j++) {
                    temp[j] = "0";
                }
                current = temp;
                useMatrix[i] = current;
            }
        }
        return useMatrix;
    }
}