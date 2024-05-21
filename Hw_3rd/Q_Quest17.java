import java.util.Scanner;

public class Q_Quest17
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    int[] arr = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      arr[i] = (int)(Math.random()*9)+1;
      System.out.printf("a[%d] = %d\n", i, arr[i] );
    }
    
    sc.close();
  }
}
