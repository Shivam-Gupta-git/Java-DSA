package JAVA_PROGRAMS.Topics.Prefix_Suffix;

import java.util.Arrays;

public class Prefix_Suffix_2 {
    public static int[] prefixSum(int[] num){
        for (int i = 1; i < num.length; i++){
            num[i] += num[i - 1];
        }
        return  num;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 4, 6};
        int[] result = prefixSum(numbers);

        System.out.println(Arrays.toString(result));
    }
}
