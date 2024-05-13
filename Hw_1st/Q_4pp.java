import java.util.Scanner;

public class Q_4pp
{
 public static void main(String[] args) 
 {
  int check = 0;
  int Input_Num = 0;

  Scanner scanner = new Scanner(System.in);

  System.out.println("카운트 다운 합니다.");
  System.out.print("양의 정숫값 : ");
  Input_Num = scanner.nextInt();
  int x = Input_Num;
  
  while( check == 0 )
  {
   if( x == -1 )
   {
    System.out.println("x의 값이" + x + "이 됬습니다.");
    check = 1;
   }
   else
   {
    x--;
    System.out.printf("%d\n", x);
   }
  }
   scanner.close();
 }
}
