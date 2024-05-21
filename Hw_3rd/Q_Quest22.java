public class Q_Quest22
{
  public static void main(String[] args)
  {
    int x = 4;
    double y = 3.14;
    
    calculate( x, y );
  }
  
  public static void calculate( int x, double y )
  {
    System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율");
    System.out.printf("2 x %d x %.2f = %.2f\n", x, y, 2 * x * y );
  }
}
