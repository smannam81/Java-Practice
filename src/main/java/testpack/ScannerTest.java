package testpack;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        System.out.println(a);

        System.out.println(b);

        String str = sc.next();
        System.out.println(str);

        sc.close();
    }
}
