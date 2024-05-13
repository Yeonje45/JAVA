import java.util.Scanner;

public class Q_15pp 
{
  public static void main(String[] args) 
  {
    System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는? : ");
    Scanner sc = new Scanner(System.in);
    int dan = sc.nextInt();
    
    for( int i = 1; i <= dan; i++)
    {
      System.out.print("*");
      for ( int j = dan; j >= i; j--)
      {
        if( j < dan)
        {
          System.out.print("*");
        }
      }
      System.out.printf("\n");
    }
    sc.close();
  }
}
