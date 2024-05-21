import java.util.Scanner;

public class Quest_30 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = 13;
    int y = 52;
    int z = 11;
    
    System.out.print("배열 a의 요소 수 : ");
    int count = sc.nextInt();
    
    int[] arr_a = new int[count];
    for( int i = 0; i < count; i++ )
    {
      arr_a[i] = (int)(Math.random()*98)+1;
      System.out.printf("a[%d]:%d\n", i, arr_a[i] );
    }
    
    System.out.printf("x, y의 최솟값은 %d 입니다.\n", min( x, y));
    System.out.printf("x, y, z의 최솟값은 %d 입니다.\n", min( x, y, z ) );
    System.out.printf("배열 a의 최솟값은 %d 입니다.\n", min( arr_a ) );
    
    sc.close();
  }
  
  public static int min ( int[] a )
  {
    int result = 99;
    
    for( int i = 0; i < a.length; i++ )
    {
      if( result > a[i] )
      {
        result = a[i];
      }
    }
    
    return result;
  }
  
  public static int min( int a, int b )
  {
    int result = 0;
    
    if( a < b )
    {
      result = a;
    }
    if( a > b)
    {
      result = b;
    }
    
    return result;
  }
  
  public static int min( int a, int b, int c )
  {
    int result = 99;
    if( result > a )
    {
      result = a;
    }
    if( result > b )
    {
      result = b;
    }
    if( result > c )
    {
      result = c;
    }
    
    return result;
  }
}
