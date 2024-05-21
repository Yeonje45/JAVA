import java.util.Scanner;

public class Q_Quest16
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    
    int[] n_arr = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      n_arr[i] = (int)(Math.random()*98)+1;
      System.out.printf("a[%d] = %d\n", i, n_arr[i] );
    }
    
    // 셔플
    int suffle = 0;

    boolean mix = true;
    
    while( mix == true )
    {
      int s_a1 = (int)(Math.random()*(count-1))+1;
      int s_a2 = (int)(Math.random()*(count-1))+1;
      
      if( s_a1 != s_a2 )
      {
        int temp = n_arr[s_a1];
        n_arr[s_a1] = n_arr[s_a2];
        n_arr[s_a2] = temp;
        suffle++;
      }
      
      if( suffle == 100 )
      {
        mix = false;
      }
    }
    
    System.out.println("요소를 섞었습니다.");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.printf("a[%d] = %d\n", i, n_arr[i] );
    }
    
    
    sc.close();
  }
}
