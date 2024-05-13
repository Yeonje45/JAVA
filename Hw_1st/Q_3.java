import java.util.Scanner;

public class Q_3
{
 public static void main(String[] args)
 {
  int a, b = 0;
  int x = 0;

  Scanner scanner = new Scanner(System.in);

  System.out.print("정수A : ");
  a = scanner.nextInt();
  System.out.print("정수B : ");
  b = scanner.nextInt();

  scanner.close();

   if( a > b )
   {
    for( x = b; x < a + 1; x++)
    {
     System.out.printf("%d ", x);
    }
   }
  if ( b > a)
  {
   for( x = a; x < b + 1; x++)
   {
    System.out.printf("%d ", x);
   }
  }
 }
}
