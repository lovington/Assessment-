import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 45};
        int[] arr2 = {1, 2, 3};
        int[] combined = combine(arr1, arr2);
        System.out.println(Arrays.toString(combined));
    }

    public static int[] combine(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length)
                result[index++] = arr1[i];
            if (i < arr2.length)
                result[index++] = arr2[i];
        }
        return result;
    }
}
