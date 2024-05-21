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
    
    ////////////////////////////////////////////////////////////////// 회전전
    String origin = Integer.toString(x,2);
    String mix_origin = '0' + origin;
    
    System.out.println("회전 전 = ");
    System.out.println(mix_origin);
    ////////////////////////////////////////////////////////////////// 오른쪽 회전시작
    
    int right = rTotate(x, n);
    String cutting_R = mix_origin.substring(0, 26);
    String move_cutting_R = Integer.toString(right);
    // System.out.println(cutting);
    // System.out.println(move_cutting);
    System.out.println(move_cutting_R + cutting_R);
    
    ////////////////////////////////////////////////////////////////// 왼쪽 회전시작
    int left = lTotate(x, n);
    String cutting_L = mix_origin.substring(6, 32);
    String move_cutting_L = '0'+ Integer.toString(left);
    
    // System.out.println(cutting_L + move_cutting_L);
    // System.out.println(cutting_L);
    // System.out.println(move_cutting_L);
    System.out.println(cutting_L + move_cutting_L);

  }
  
  public static int rTotate( int x, int n) 
  {
    String origin = Integer.toString(x,2);
    String mix_origin = '0' + origin;
    
    String bit1 = mix_origin.substring(26, 32);
    // System.out.println(bit);
    int send = Integer.parseInt(bit1);
    // System.out.println(mix_origin);
    
    // result = Integer.parseInt(mix_origin,10);
    // System.out.println(result);
    
    return send;
  }
  
  public static int lTotate( int x, int n ) 
  { 
    String origin = Integer.toString(x,2);
    String mix_origin = '0' + origin;
    
    String bit2 = mix_origin.substring(0, 6);
    
    int send = Integer.parseInt(bit2);
    
    return send;
  }
}
