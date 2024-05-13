// int형 스텍오버플로우 // 문제에러

public class Quest_12 
{
  public static void main(String[] args) throws java.lang.Exception
  {
    int x = 1565857138;
    int n = 6;
    
    System.out.println("정수x를 n비트 회전합니다.");
    System.out.println(x);
    System.out.println(n);
    
    ////////////////////////////////////////////////////////////////// 회전전 시작
    String origin = Integer.toString(x,2);
    String mix_origin = '0' + origin;
    
    System.out.println("회전 전 = ");
    System.out.println(mix_origin);
    ////////////////////////////////////////////////////////////////// 회전전 끝
    
    // int right = rTotate(x, n);
    // System.out.println("오른쪽 회전 = ");
    // String right_origin = Integer.toString(right,2);
    // System.out.println(right);

  }
  
  public static int rTotate( int x, int n) 
  {
    String origin = Integer.toString(x,2);
    String mix_origin = '0' + origin;
    
    
    for( int i = 1; i <= n; i++ )
    {
      char lastChar = mix_origin.charAt(mix_origin.length() - 1);
      String restOfString = mix_origin.substring(0, mix_origin.length() -1);
      mix_origin = lastChar + restOfString;
    }
    
    System.out.println(mix_origin);
    
    // result = Integer.parseInt(mix_origin,10);
    // System.out.println(result);
    
    return 0;
  }
  
  public static int lTotate( int x, int n ) 
  { 
    int result = 0;
    result = x << n;
    
    return result;
  }
}
