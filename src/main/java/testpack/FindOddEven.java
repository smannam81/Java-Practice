package testpack;

import java.util.Scanner;

public class FindOddEven {
    public static void main (String[] args)
    {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
        sc.close();

    }
}
