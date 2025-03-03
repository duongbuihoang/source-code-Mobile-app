import java.util.Scanner;

public class bai4chap2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 1;
        if(3>n || n>8)System.out.print("Error");
       else
       {
           int[][] a = new int[n+2][n+2];
           /*for(int i=1;i<=n;i++)
               for(int j=1;j<=n;j++)
               {
                a[i][j] =
               }*/
           int way = n;
           if(way%2!=0)
           {
               way/=2;
               way++;
           }else way/=2;
          for(int i=1;i<=way;i++)
          {

                  for(int j=i;j<n-i+1;j++) {
                      a[i][j] = dem;
                      dem++;
                  }

                  for(int k = i;k<n-i+1;k++)
                  {
                      a[k][n-i+1] = dem;
                      dem++;
                  }

                  for(int j=n-i+1;j>i;j--) {
                      a[n-i+1][j] = dem;
                      dem++;
                  }
                  for(int k = n-i+1;k>i;k--) {
                      a[k][i] = dem;
                      dem++;
                  }
          }
           for(int i=1;i<=n;i++) {
               for (int j = 1; j <= n; j++) {
                   System.out.print(a[i][j] + " ");
               }
               System.out.print('\n');
           }
       }

    }
}
