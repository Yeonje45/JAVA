import java.util.Scanner;

public class Q_Quest05
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int dnum_length = 5;
    double n_sum = 0;
    double[] dnum = new double[dnum_length];
    
    
    System.out.printf("초기화하지 않은 dnum[]의 값 : ");
    for( int i = 0; i < dnum_length; i++ )
    {
      System.out.printf("%.1f ", dnum[i]);
    }
    System.out.printf("\n");
    
    for( int i = 0; i < dnum_length; i++ )
    {
      System.out.printf("dnum[%d] 번째 데이터 입력 : ", i );
      dnum[i] = sc.nextFloat();
    }
    
    for( int i = 0; i < dnum_length; i++ )
    {
      n_sum = n_sum + dnum[i];
    }
    System.out.printf("배열의 합은 %.1f입니다.\n", n_sum );
    System.out.printf("배열값의 평균은 %.1f입니다.\n", n_sum/dnum_length );
    
    sc.close();
  }
}
