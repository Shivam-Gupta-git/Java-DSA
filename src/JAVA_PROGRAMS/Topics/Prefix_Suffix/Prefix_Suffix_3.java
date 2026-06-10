package JAVA_PROGRAMS.Topics.Prefix_Suffix;

import java.util.Arrays;

public class Prefix_Suffix_3 {
    public static int[] sumOfValue(int[] num){
        for (int i = 1; i <= 3; i++){
            num[i] += num[i - 1];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 4};
        sumOfValue(numbers);
        int[] result = sumOfValue(numbers);

        System.out.println(Arrays.toString(result));
    }
}
