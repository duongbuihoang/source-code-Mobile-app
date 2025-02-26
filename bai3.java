import java.util.Scanner;
public class bai3 {
    public static void main(String[] arg)
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int ans=0;
     for(int i=1;i<n;i++)
     {
       if(i%2==0)ans+=i;
     }
     System.out.print(ans);
     sc.close();
    }
}
