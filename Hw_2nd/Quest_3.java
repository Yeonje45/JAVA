import java.util.Scanner;
import java.util.Arrays;

public class Quest_3 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("정수a : ");
    int a = sc.nextInt();
    System.out.print("정수b : ");
    int b = sc.nextInt();
    System.out.print("정수c : ");
    int c = sc.nextInt();
 
    System.out.printf("중간값은 %d 입니다.\n", CheckNum(a, b, c));
    sc.close();
  }
  
  public static int CheckNum( int a, int b, int c) 
  {
    int[] num = {a,b,c};
    
    Arrays.sort(num);
    
    return num[1];
  }
}
