import java.util.Scanner;
import java.util.Arrays;
public class bai10{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];// cấp phát cho mảng n phần tử với index từ 0 -> n
        for(int i=1;i<=n;i++)
        {
            a[i] =  sc.nextInt();
        }
        int t;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        for(int i=0;i<n;i++)System.out.print(a[i]);
        sc.close();
    }
}
