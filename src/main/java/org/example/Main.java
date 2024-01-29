package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a,b,c,i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Tamsayı : ");
        a = scanner.nextInt();
        System.out.print("2. Tamsayı : ");
        b = scanner.nextInt();

        for (i=1;  i<=a*b; i++)

            if ((i%a==0) && (i%b==0))
            {
                System.out.printf("\nOKEK (%d,%d) = %d\n",a,b,i); break;
            }
        c = Math.max(a, b);
        for(i=c; i>0; i--)
            if((a%i==0) && (b%i==0))
            {
                System.out.printf("OBEB (%d,%d) = %d\n",a,b,i); break;
            }
    }
}