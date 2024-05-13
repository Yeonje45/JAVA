import java.util.Scanner;

public class Q_10 
{
  public static void main(String[] args) 
  {
    int total = 0;
    System.out.println("1부터 n까지의 합을 구합니다. n의 값 : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for( int i = 0; i <= n; i++)
    {
      total = total + i;
    }
    System.out.printf("1부터 %d까지의 합은 %d입니다.\n", n, total);
    
    sc.close();
  }
}
