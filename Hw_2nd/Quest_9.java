import java.util.Scanner;

public class Quest_9 
{
  public static void main(String[] args) 
  {
    int check = 0;
    while( check == 0)
    {
      int number= 0;
      Scanner sc = new Scanner(System.in);
      
      while( number == 0)
      {
        System.out.print("양의 정숫값 : ");
        number = sc.nextInt();
        if( number < 0 )
        {
          number = 0;
        }
      }
      
      System.out.printf("반대로 읽으면 %d 입니다.\n", readPlusInt(number));
      
      System.out.print("다시 한 번? < Yes...1 / No...0> : ");
      int q = sc.nextInt();
      if( q == 0 )
      {
        check = 1;
      }
      
      sc.close();;
    }
        
  }
  
  public static int readPlusInt( int a ) 
  {
    int num;
    String str = Integer.toString( a );
    String r_str = "";
    
    for( int i = 1; i <= str.length(); i++ )
    {
      r_str += str.charAt(str.length()-i);
    }
    
    num = Integer.parseInt(r_str);
    return num;
  }
}
