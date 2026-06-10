package JAVA_PROGRAMS.Topics.Function_11;

import java.util.Scanner;

public class Prime_Or_Not_8 {
/*------- check if a number is prime or not --------*/
/* note: A prime number is a number greater than 1 that has exactly two factors:
        * 1
        * The number itself
*/
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter your number, which you want to check Is this number Prime or Not: ");
    int num = sc.nextInt();
    boolean result = primeNUm(num);

    if (result) {
        System.out.println(num + " is a Prime Number");
    } else {
        System.out.println(num + " is not a Prime Number");
    }
}
    public static boolean primeNUm(int num){
        boolean isPrime = true;
        if(num <= 1){
            isPrime = false;
        }else {
            for (int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
        }
        return  isPrime;
    }

}
