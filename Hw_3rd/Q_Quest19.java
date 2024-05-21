import java.util.Scanner;

public class Q_Quest19
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    int first_num = 99;
    int last_num = 99;
    
    int[] arr = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      arr[i] = (int)(Math.random()*69)+1;
      System.out.printf("a[%d] = %d\n", i, arr[i] );
    }
    
    System.out.print("찾을 숫자 : ");
    int n_Search = sc.nextInt();
    
    for( int i = 0; i < count; i++ )
    {
      if( arr[i] == n_Search )
      {
        if( first_num == 99 )
        {
          first_num = i;
        }
        else
        {
          last_num = i;
        }
      }
    }
    
    if( first_num != 99 )
    {
      System.out.printf("그 값은 a[%d]에 있습니다.\n", first_num);
    }
    if ( last_num != 99 )
    {
      System.out.printf("가장뒤에있는 그 값은 a[%d]에 있습니다.\n", last_num );
    }
    
    sc.close();
  }
}
