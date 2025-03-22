//  Write a java program to find sum of digits of a given number.

import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n,sum=0;
    System.out.println("Enter Number");
    n= sc.nextInt();
    while (n>0){
        sum=sum+n%10;
        n=n/10;
    }
    System.out.println("sum of digits "+sum);
}
}
