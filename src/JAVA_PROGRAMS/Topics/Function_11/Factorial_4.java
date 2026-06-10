package JAVA_PROGRAMS.Topics.Function_11;

import java.util.Scanner;

public class Factorial_4 {
/*----- -> Find factorial of n number.(1st part) ------*/
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter your number, which you want to find factorial: ");
    int num = sc.nextInt();

    int result = factNum(num);
    System.out.println("Factorial of "+num+ " is: "+ result);
}

    public static int factNum(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return  fact;
    }
}
