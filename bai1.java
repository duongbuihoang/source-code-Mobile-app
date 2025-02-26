import java.util.Scanner;
public class bai1
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)System.out.println("Đây là số nguyên dương");
        else
        if(n<0)
        {
            System.out.println("Đây là số nguyên âm");
        }
        else System.out.println("Đây là số 0");
        sc.close();
    }
}
