package testpack;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;

        for (int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of the number is "+fact);
        sc.close();
    }
}
