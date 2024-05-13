import java.util.Scanner;

public class Q_Quest10
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[6][2];
    
    System.out.println("6명의 국어, 수학 점수를 입력하세요.");
    
    for( int i = 0; i < 6; i++ )
    {
      System.out.printf("%d번 ", i+1);
      for( int j = 0; j < 2; j++ )
      {
        if( j == 0 )
        {
          System.out.print("국어:");
          arr[i][j] = sc.nextInt();
        }
        else
        {
          System.out.print("    수학:");
          arr[i][j] = sc.nextInt();
        }
      }
    }
    
    System.out.println("No. 국어  수학  평균");
    for( int i = 0; i < 6; i++ )
    {
      System.out.printf(" %d   %d    %d   %.1f\n", i+1, arr[i][0], arr[i][1],  (double)(arr[i][0]+arr[i][1])/2);
    }
    
    sc.close();
  }
}
