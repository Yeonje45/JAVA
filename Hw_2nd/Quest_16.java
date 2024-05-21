// import java.util.Scanner;
// 이해가안되네 ?

import java.util.Scanner;

public class Quest_16 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("사람 수는 : ");
    int count = sc.nextInt();
    
    int[] human_info1 = new int[count];
    int[] human_info2 = new int[count];
    
    System.out.printf("%d명의 신장과 체중을 입력하자.\n", count );
    
    for( int i = 0; i < count; i++ )
    {
      System.out.printf("%d번의 신장 : ", i+1);
      human_info1[i] = sc.nextInt();
      System.out.printf("%d번의 체중 : ", i+1);
      human_info2[i] = sc.nextInt();
    }
    
    int result1 = minOf(human_info1);
    int result2 = minOf(human_info2);
    
    System.out.printf("가장 키가 작은 사람의 신장 : %dcm\n", result1);
    System.out.printf("가장 마른 사람의 체중 : %dkg\n", result2);
    
    
    sc.close();
  }
  
  
  public static int minOf( int[] a ) 
  {
    int min_result = 999999;
    
    for( int i = 0; i < a.length; i++ )
    {
      if( min_result > a[i] )
      {
        min_result = a[i];
      }
    } 
    
    return min_result;
  }
}
