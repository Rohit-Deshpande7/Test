package PatternsPrograms;

import java.util.Scanner;

// 12345
// 1234
// 123
// 12
// 1
public class Pattern5 {
    public static void pattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
          System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        pattern(n);
    }
}
