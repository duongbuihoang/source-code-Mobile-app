import java.util.Scanner;

public class bai3chap2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if(h<0)System.out.print("Error");
        for(int i=1;i<=h;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        int num = -1;
        for(int i=0;i<h;i++)
        {
            num+=2;
            for(int j=0;j<2*h;j++)
            {
              if(j>=h-i && j<=h-i+num-1)System.out.print("*");
              else System.out.print(" ");
            }
            System.out.print('\n');
        }

    }
}
