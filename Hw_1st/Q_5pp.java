import java.util.Scanner;

public class Q_5pp
{
 public static void main(String[] args)
 {
  int check = 0 ;

  System.out.print("몇 개의 *을 표시할까요? : ");
  Scanner sc = new Scanner(System.in);
  int count = sc.nextInt();
  
  while( check == 0 )
  {
   
   System.out.print("*");
   count--;

   if( count == 0)
   {
     check = 1;
   }
  }
  sc.close();
 }
}
