package JAVA_PROGRAMS.Topics.Array_13;

import java.util.Scanner;

public class testing {
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
