import java.util.Scanner;

public class Quest_31
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.printf("int    형 정수 a의 값 : ");
    int a = sc.nextInt();
    System.out.printf("long   형 정수 a의 값 : ");
    long b = sc.nextLong();
    System.out.printf("float  형 정수 a의 값 : ");
    float c = sc.nextFloat();
    System.out.printf("double 형 정수 a의 값 : ");
    double d = sc.nextDouble();
    
    System.out.printf("a의 절대값은 %d 입니다.\n", absolute(a));
    System.out.printf("b의 절대값은 %d 입니다.\n", absolute(b));
    System.out.printf("c의 절대값은 %.1f 입니다.\n", absolute(c));
    System.out.printf("d의 절대값은 %.1f 입니다.\n", absolute(d));
    
    sc.close();
  }
  
  public static int absolute( int x )
  {
    int result = 0;
    
    if( x < 0 )
    {
      result -= x;
    }
    else
    {
      result = x;
    }
    return result;
  }
  
  public static long absolute( long x )
  {
    long result = 0;
    if( x < 0 )
    {
      result -= x;
    }
    else
    {
      result = x;
    }
    return result;
  }
  
  public static float absolute ( float x )
  {
    float result = 0;
    if( x < 0 )
    {
      result -= x;
    }
    else
    {
      result = x;
    }
    return result;
  }
  
  public static double absolute ( double x )
  {
    double result = 0;
    if( x < 0 )
    {
      result -= x;
    }
    else
    {
      result = x;
    }
    return result;
  }
}
