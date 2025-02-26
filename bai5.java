import java.util.Scanner;
import java.util.Arrays;
public class bai5 {
    public static void main(String[] arg)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double ans = 0;
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(n%2!=0)
        {
            System.out.print(a[n/2]);
        }
        else
        {
            int l = (n/2)-1;
            int r = n/2;
            ans = (a[l]+a[r])/2.0;
           System.out.printf("%f",ans);
        }
        sc.close();
    }
}
