import java.util.Scanner;

public class Quest_10 
{
  public static void main(String[] args) 
  {
    random();
  }
  
  public static void random() 
  {
    int check = 0;
    Scanner sc = new Scanner(System.in);
    while(check == 0)
    {
      int x, y, z, n_sum = 0;
      
      x = (int)(Math.random()*(999-100))+100;
      y = (int)(Math.random()*(999-100))+100;
      z = (int)(Math.random()*(999-100))+100;
      n_sum = x + y - z;
      
      System.out.println("암산 훈련!");
      System.out.printf("%d + %d - %d = ", x, y, z);
      int input_num = sc.nextInt();
      
      if( input_num == n_sum)
      {
        System.out.println("정답입니다!");
      }
      else if ( input_num != n_sum )
      {
        System.out.println("틀렸습니다!");
        System.out.printf("%d + %d - %d = %d\n", x, y, z, n_sum);
      }
      
      int exit = 0;
      while( exit == 0 )
      {
        System.out.print("다시 한 번? <Yes...1/No...0> : ");
        int re = sc.nextInt();
        if( re == 0)
        {
          check = 1;
        }
      }  
    }
    
    sc.close();
  }
}
