import java.util.Random;
import java.util.Scanner;


public class bai1chap2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Random rd = new Random();
            int u = rd.nextInt(n);
                int v = u;
               while(u==v)
               {
                    v = rd.nextInt(n);
               }
               int t = a[u];
               a[u] = a[v];
               a[v] = t;
               for(int i=0;i<n;i++)System.out.print(a[i] + " ");
    }
}
