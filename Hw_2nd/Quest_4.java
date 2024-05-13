import java.util.Scanner;

public class Quest_4 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("1부터 x까지의 합을 구하자.");
    System.out.print("x의 값 : ");
    int inputNum = sc.nextInt();
    
    System.out.printf("1부터 %d까지의 합은 %d 입니다.\n", inputNum, my_Sum(inputNum));
    sc.close();
  }
  public static int my_Sum( int inputNum ) 
  {
    int n_Sum = 0;
    for( int i = 1; i <= inputNum; i++)
    {
      n_Sum = n_Sum + i;
    }
    return n_Sum;
  }
}
