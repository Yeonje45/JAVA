import java.util.Scanner;

public class Q_10pp
{
  public static void main(String[] args) 
  {
    int total = 0;
    System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for( int i = 1; i <= n; i++)
    {
      total = total + i;
      if( i == 1 )
      {
        System.out.printf("%d", i);
      }
      else
      {
        System.out.printf(" + %d", i);
      }
      
    }
    System.out.printf(" = %d\n", total);
    
    sc.close();
  }
}
