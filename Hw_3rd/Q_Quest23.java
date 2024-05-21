public class Q_Quest23
{
  public static void main(String[] args)
  {
    sum();
  }
  
  public static void sum()
  {
    int sum = 0;
    for( int i = 0; i <= 10; i++ )
    {
      sum += i;
    }
    System.out.printf("1부터 10의 합계 : %d\n", sum );
  }
}
