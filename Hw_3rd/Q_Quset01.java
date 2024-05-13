import java.util.Scanner;

public class Q_Quset01 
{
  public static void main(String[] args)
  {
    String[] info = new String[3];
    Scanner sc = new Scanner(System.in);
    System.out.println("3개 문자열을 입력하세요.");
    
    for( int i = 0 ; i < 3; i++ )
    {
      info[i] = sc.nextLine();
    }
    
    for( int i = 0; i < 3; i++ )
    {
      System.out.print(info[i] + " ");
    }
    System.out.printf("\n");
    
    sc.close();
  }
}
