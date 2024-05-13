import java.util.Scanner;

public class Q_8 
{
    public static void main(String[] args) 
    {
        int total = 1;
        System.out.print("양의 정숫값 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for( int i = 1 ; i <= num ; i++ )
        {
            total = total * i;
            // System.out.printf("%d = %d\n",i, total);
        }
        System.out.printf("1부터 %d까지의 곱은 %d입니다.", num, total);
        sc.close();
    }
}
