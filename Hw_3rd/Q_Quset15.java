import java.util.Scanner;

public class Q_Quset15
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("요소 수 : ");
    int count = sc.nextInt();
    int r_count = count-1;
    int[] arr_a = new int[count];
    int[] arr_b = new int[count];
    
    for( int i = 0; i < count; i++ )
    {
      arr_a[i] = (int)(Math.random()*14)+1;
      System.out.printf("a[%d] = %d\n", i, arr_a[i]);
    }
    
    for( int i = 0; i < count; i++ )
    {
      arr_b[i] = arr_a[r_count];
      r_count--;
    }
    
    System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
    
    for( int i = 0; i < count; i++ )
    {
      System.out.printf("b[%d] = %d\n", i, arr_b[i] );
    }
    
    sc.close();
  }
}
