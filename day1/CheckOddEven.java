package day1;

import java.util.Scanner;

public class CheckOddEven {
    
    public static void main(String[] aggs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No" + ":");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("enter number id even");
        }
        else {
            System.out.println("enter number id odd");
        }
        
        sc.close();
    }
}