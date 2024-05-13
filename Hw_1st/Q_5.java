import java.util.Scanner;

public class Q_5 
{
 public static void main(String[] args) 
 {
  System.out.print("몇 개의 *을 표시할까요? : ");
  Scanner sc = new Scanner(System.in);
  int count = sc.nextInt();

  for ( int i=0 ; i < count; i++ )
  {
   System.out.print("*");
  }
  sc.close();
 }
}
