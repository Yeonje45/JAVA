import java.util.Scanner;

public class Q_Quest18
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    int[] arr = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      if( i == 0 )
      {
        arr[i] = (int)(Math.random()*9)+1;
      }
      else
      {
        arr[i] = (int)(Math.random()*9)+1;
        if( arr[i-1] == arr[i] )
        {
          i--;
        }
      }
    }
    
    for( int i = 0; i < count; i++ )
    {
      System.out.printf("a[%d] = %d\n", i, arr[i]);
    }
    
    
    sc.close();
  }
}
