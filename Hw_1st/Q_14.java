import java.util.Scanner;

public class Q_14 
{
  public static void main(String[] args) 
  {
    System.out.println("정방형을 표시합니다.");
    System.out.print("단수는 : ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    for( int i = 1; i <= num; i++)
    {
      System.out.print("*");
      for( int j = 1; j < num; j++)
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
    
    sc.close();
  }
}
