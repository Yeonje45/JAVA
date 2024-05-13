import java.util.Scanner;

public class Q_Quest07
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int max = 10;
    int check_num = 10;
    System.out.printf("요소 수 : ");
    int count = sc.nextInt();
    
    int[] arr = new int[count];
    int[][] n_arr = new int[max][count];
    
    System.out.printf("%d\n", count);
    for( int i = 0; i < count; i++ )
    {
      arr[i] = (int)(Math.random()*9)+1;
      System.out.printf("%d : %d \n",i, arr[i]);
    }
    System.out.printf("\n");
    
    
    // 배열에 값 넣기
    for( int i = 0; i < count; i++ )
    {
      for( int j = 0; j < max; j++ )
      {
        if( j == 0 )
        {
          check_num = 10;
          check_num = check_num - arr[i];
        }
        
        if( check_num > 0 )
        {
          n_arr[j][i] = 0;
          check_num--;
        }
        else
        {
          n_arr[j][i] = 1;
        }
        
      }
    }
    // 배열에 값넣기 끝
    
   
    
    // 출력 시작
    for(int i = 0; i < max; i++ )
    {
      for( int j = 0; j < count; j++ )
      {
        if( n_arr[i][j] == 0 )
        {
          System.out.printf(" ");
        }
        else
        {
          System.out.printf("*");
        }
        
      }
      System.out.printf("\n");
    }
    
    for( int i = 0; i < count; i++ )
    {
      System.out.print("=");
    }
    System.out.printf("\n");
    for( int i = 0 ; i < count; i++)
    {
      if( i > 9)
      {
        System.out.print(i-10);
      }
      else
      {
        System.out.print(i);
      } 
    }
    // 출력 끝
    
    
    
    
    
    
    sc.close();
  }
}
