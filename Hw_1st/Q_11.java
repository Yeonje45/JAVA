import java.util.Scanner;

public class Q_11 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("몇 cm부터 : ");
    int min = sc.nextInt();
    System.out.print("몇 cm까지 : ");
    int max = sc.nextInt();
    System.out.print("몇 cm 단위 : ");
    int up = sc.nextInt();
    
    System.out.println("신장 표준 체중");
    System.out.println("----------");
    int sum = min;
    double avr = 0.0;
    for ( int i = min; i <= max; i += up)
    {
      avr = (sum-100)*0.9;
      System.out.printf("%d %.1f\n", sum, avr);
      sum = sum + up;
    }
   
    sc.close();
  }
}
