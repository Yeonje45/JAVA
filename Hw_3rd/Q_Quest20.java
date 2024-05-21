import java.util.Scanner;

public class Q_Quest20
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("사람 수 : ");
    int count = sc.nextInt();
    
    int[] arr = new int[count];
    
    int min_num = 101;
    int max_num = 0;
    int n_sum = 0;
    
    for( int i = 0; i < count; i++ )
    {
      System.out.printf("%d번의 점수 : ", i + 1 );
      arr[i] = sc.nextInt();
      n_sum = n_sum + arr[i];
      
      if( min_num > arr[i] )
      {
        min_num = arr[i];
      }
      if( max_num < arr[i] )
      {
        max_num = arr[i];
      }
    }
    
    System.out.printf("합계는 %d점 입니다.\n", n_sum);
    System.out.printf("평균은 %.1f점 입니다.\n", (float)n_sum/count);
    System.out.printf("최고점은 %d점 입니다.\n", max_num);
    System.out.printf("최저점은 %d점 입니다.\n", min_num);
    
    sc.close();
  }
}
