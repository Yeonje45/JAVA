import java.util.Scanner;

public class Q_Quest08
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int class_ban = 0;
    int[] class_human = new int[99];
    int total = 0;
    int human_count = 0;
        
    int[][] arr = new int[99][99];
    
    System.out.print("학급 수 : ");
    class_ban = sc.nextInt();
    int[] n_sum = new int[class_ban];
        
    System.out.print("\n");
    for( int i = 0; i < class_ban; i++ ) //학급수
    {
      System.out.printf("%d반의 학생 수 : ", i+1);
      class_human[i] = sc.nextInt();
      for( int j = 0; j < class_human[i]; j++ )
      {
        System.out.printf("%d반의 %d번의 점수 : ",i+1 , j+1);
        arr[i][j] = sc.nextInt();
      }
      System.out.printf("\n");
    }
    
    for( int i = 0; i < class_ban; i++ )
    {
      for(int j = 0; j < class_human[i]; j++ )
      {
        n_sum[i] += arr[i][j];
        human_count++;
      }
    }
    
    
    System.out.println("  반 | 합계  평균");
    System.out.println("------------------");
    for(int i = 0; i < class_ban; i++)
    {
      System.out.printf(" %d반 |  %3d  %.1f\n", i+1, n_sum[i], (double)n_sum[i]/class_human[i]);
      total = total + n_sum[i];
    }
    System.out.println("------------------");
    System.out.printf("  합 |  %3d  %.1f\n", total, (double)total/human_count);
    // for( int i = 0; i < class_ban; i++)
    // {
    //   for( int j = 0; j < class_human; j++ )
    //   {
        
    //   }
    // }
    
    
    
    sc.close();
  }
}
