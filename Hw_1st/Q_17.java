import java.util.Scanner;

public class Q_17 
{
  public static void main(String[] args)
  {
    int zero = 0;
    System.out.println("피라미드를 표시합니다.");
    System.out.print("단수는? : ");
    Scanner sc = new Scanner(System.in);
    int dan = sc.nextInt();
    // int count= 0;
    for ( int i = 1; i <= dan; i++)
    {
      System.err.print(" ");
      for( int j = dan; j >= i; j--)
      {
        if( j < dan )
        {
          System.out.print(" ");
        }
      }
      for( int z = 0; z <= i; z++)
      {
        if( z > 0)
        {
          if( i < 10)
          {
            System.out.printf("%d",i);
          }
          if( i == 10)
          {
            System.out.printf("%d",zero);
          }
          if( i > 10)
          {
            System.out.printf("%d",i%10);
          }
          
        }
      }
      
      for( int y = 0; y < i; y++)
      {
        if ( y > 0)
        {
          if( i<10 )
          {
            System.out.printf("%d",i);
          }
          if( i == 10)
          {
            System.out.printf("%d",zero);
          }
          if( i> 10)
          {
            System.out.printf("%d",i%10);
          }
        }
        
      }
      System.out.print("\n");
    }
    sc.close();
  }
}
