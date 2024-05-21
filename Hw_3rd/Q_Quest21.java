import java.util.Scanner;

public class Q_Quest21
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    int[] arr = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      System.out.printf("a[%d] = ", i );
      arr[i] = sc.nextInt();

    }
    
    for( int i = 0; i < count; i++ )
    {
      if( i == 0 )
      {
        System.out.printf("a = { ");
      }
      if( i < count -1 )
      {
        System.out.printf("%d, ", arr[i] );
      }
      if( i == count-1  )
      {
        System.out.printf("%d }\n", arr[i] );
      }
    }
    
    sc.close();
  }
}
