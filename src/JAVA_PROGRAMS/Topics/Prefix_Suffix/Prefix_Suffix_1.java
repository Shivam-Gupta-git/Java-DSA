package JAVA_PROGRAMS.Topics.Prefix_Suffix;

import java.util.Arrays;

public class Prefix_Suffix_1 {
    public static int[] prefixSum(int[] num) {
        int[] prefixSum = new int[num.length];

        prefixSum[0] = num[0];

        for (int i = 1; i < num.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + num[i];
        }

        return prefixSum;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 4, 5, 7};

        int[] result = prefixSum(number);

        System.out.println(Arrays.toString(result));
    }
}
