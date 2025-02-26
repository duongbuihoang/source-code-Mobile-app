import java.util.Scanner;
//import java.lang.String;
public class bai8 {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char[] a = s.toCharArray();
        int check = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>='0' && a[i]<='9')
            {
                check = 1;
                break;
            }
        }
        if(check == 1)System.out.print("Có");
        else System.out.print("Không");
        sc.close();
    }
}
