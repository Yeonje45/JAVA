import java.util.Scanner;

public class Q_4
{
 public static void main(String[] args) 
 {
  int x = 0;
  int check = 0;
  int Input_Num = 0;
  Scanner scanner = new Scanner(System.in);

  while( check == 0 )
  {
   System.out.println("카운트 다운 합니다.");
   System.out.print("양의 정숫값 : ");
   Input_Num = scanner.nextInt();

   if ( Input_Num > 0)
   {
    for ( x = Input_Num ; x > -1 ; x-- )
    {
     System.out.println(x);
    }
    check = 1;
    if( x == -1)
     {
      System.out.printf("x의 값이 %d이 되었습니다.\n", x);
     }
   }
  }
  scanner.close();
 }
}
