import java.util.Scanner;

public class bai2 {
    public  static void main( String [] arg)
    {
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t=1;
        if(a>0 && b>0 && c>0) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
            {
                System.out.println("Đây là ba cạnh của một tam giác vuông");
            }
            else t=0;
        }
        else t=0;
        if(t==0)System.out.println("Đây không là ba cạnh của một tam giác vuông");
        sc.close();
    }
}
