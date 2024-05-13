import java.util.Scanner;

public class Q_18 
{
  public static void main(String[] args)
  {
    int check = 0;
    System.out.print("2이상의 정숫값 : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    check = num %2;
    
    for ( int i = 2; i < num; i++ )
    {
      if (num % i == 0)
      {
        check = 1;
      }
    }
    
    if( num == 2 )
    {
      System.out.println("소수 입니다.");
      
    }
    else
    {
      if ( check == 0 )
      {
        System.out.println("소수가 아닙니다.");
      }
      else
      {
        System.out.println("소수 입니다.");
      }
    }
    
    sc.close();
  }
}
