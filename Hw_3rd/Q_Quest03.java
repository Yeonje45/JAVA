import java.util.Scanner;

public class Q_Quest03
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int human = 2;
    int score = 2;
    int[][] arr = new int[human][score];
    
    for( int i = 0; i < human; i++ )
    {
      System.out.printf("학생번호%d\n", i+1 );
      System.out.print("국어점수 : ");
      arr[i][0] = sc.nextInt();
      System.out.print("수학점수 : ");
      arr[i][1] = sc.nextInt();
    }
    
    for( int i = 0; i < human; i++ )
    {
      System.out.printf("학생번호%d\n", i+1 );
      System.out.printf("국어:%.1f 수학:%.1f, 평균:%.1f\n", (double)arr[i][0], (double)arr[i][1], (double)(arr[i][0]+arr[i][1])/2 );
    }
    
    
    
    
    
    
    
    sc.close();
  }
}
