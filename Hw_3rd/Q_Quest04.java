public class Q_Quest04
{
  public static void main(String[] args)
  {
    int hr1[][] = {{2,3,4},{3,2,1}};
    int hr2[][] = {{1,2,3},{-4,-2,1}};
    int[][] hr3 = new int[2][3];
    
    for( int i = 0; i < 2; i++ )
    {
      for( int j = 0; j < 3; j++ )
      {
        hr3[i][j] = hr1[i][j] + hr2[i][j];
      }
    }
    
    for( int i = 0; i < 2; i++)
    {
      for( int j = 0; j < 3; j++ )
      {
        System.out.printf("%2d ",hr3[i][j]);
      }
      System.out.printf("\n");
    }
  }
}
