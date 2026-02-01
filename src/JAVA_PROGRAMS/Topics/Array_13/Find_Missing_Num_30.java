package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Arrays;

public class Find_Missing_Num_30 {
    public static void findMissingNum(int[] num) {
        int[] missingArray = new int[num.length];
        int index = 0;
        int compNum = 1;
        for (int i = 0; i < num.length; i++){
            while (num[i] > compNum){
                missingArray[index ++] = compNum;
                compNum++;
            }
            compNum++;
        }
        System.out.println(Arrays.toString(Arrays.copyOf(missingArray, index)));
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 4, 5, 7};
        findMissingNum(number);
    }
}
