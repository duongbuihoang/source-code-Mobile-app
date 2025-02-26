import java.util.Scanner;
public class bai6 {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            if(a[i]>ans)ans=a[i];
        }
        System.out.print(ans);
        sc.close();
    }
}
