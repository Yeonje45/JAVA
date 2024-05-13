import java.util.Scanner;

public class Q_21 
{
  public static void main(String[] args) 
  {
    int roof = 0;
    int all_count = 10;
    int group_sum = 0;
    int group[][] = new int[10][5];
    Scanner sc = new Scanner(System.in);
    
    System.out.println("정수를 더합니다.");
    
    while( roof == 0 )
    {
      for ( int i = 0; i < all_count; i++)
      {
        System.out.printf("%d그룹\n", i+1);
        int group_count = 5;
        
        for( int j = 0; j < group_count; j++)
        {
          System.out.print("정수 : ");
          group[i][j] = sc.nextInt();
          
          if( group[i][j] == 88888 )
          {
            group_count = j - 1;
          }
          else if( group[i][j] == 99999 )
          {
            group_count = j - 1;
            all_count = i - 1;
            roof = 1;
          }
          else
          {
            group_sum = group_sum + group[i][j];
          }
        }
      }
      
      System.out.printf("\n합계는 %d입니다.\n", group_sum);
    }
    sc.close();
  }
}
