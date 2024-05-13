import java.util.Scanner;

public class Q_9 
{
    public static void main(String[] args) 
    {
      System.out.println("카운트업 합니다.");
      System.out.print("양의 정숫값 : ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      for ( int i = 0; i <= num; i++)
      {
        System.out.println(i);
      }
      
      sc.close();
    }
}
