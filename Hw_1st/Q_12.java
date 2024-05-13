import java.util.Scanner;

public class Q_12 
{
  public static void main(String[] args) 
  {
    System.out.print("정숫값 : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int result;
    for( int i = 1; i <= num; i++)
    {
      result = i * i;
      System.out.printf( "%d의 제곱은 %d입니다.\n", i, result );
    }
    sc.close();
  }
}
