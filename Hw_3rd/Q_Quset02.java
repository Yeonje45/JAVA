import java.util.Scanner;

public class Q_Quset02
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double score[] = { 90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7 };
    double n_sum = 0;
    
    for(int i = 0; i < score.length; i++ )
    {
      n_sum = n_sum + score[i];
    }
    
    System.out.printf("합계 : %.13f\n", n_sum);
    System.out.printf("평균 : %.2f\n", n_sum/10);
    
    sc.close();
  }
}
