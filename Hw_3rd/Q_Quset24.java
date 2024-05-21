public class Q_Quset24
{
  public static void main(String[] args) 
  {
    int x = 5;
    int y = 6;
    System.out.printf("%d(와)과 %d의 수 중 %d이 큽니다.\n", x, y, max( x, y) );
  }
  
  public static int max( int x, int y)
  {
    int result = 0;
    if( x > y )
    {
      result = x;
    }
    else
    {
      result = y;
    }
    return result;
  }
}
