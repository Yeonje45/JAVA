public class Quest_14
{
  public static void main(String[] args)
  {
    int x = 1431655765;
    int pos = 7;
    int n = 6;
    System.out.println("정수x의 pos번째 비트부터 n개 비트를 변경합니다.");
    
    String Origin = '0' + Integer.toString(x, 2);
        
    String Origin_reverse = "";
    for( int i = Origin.length()-1; i >= 0; i-- )
    {
      Origin_reverse = Origin_reverse + Origin.charAt(i);
    }
    
    String str1 = Origin_reverse.substring(0, pos);
    // String str2 = Origin_reverse.substring(pos, pos+n);
    String str3 = Origin_reverse.substring(pos+n, 32);
    
    // System.out.println(str1);
    // System.out.println(str2);
    // System.out.println(str3);
    
    // Set
    int set_result = set(x, pos, n);
    String set_reverse = str1 + set_result + str3;
    String set_mix = "";
    for( int i = set_reverse.length()-1; i >= 0; i-- )
    {
      set_mix = set_mix + set_reverse.charAt(i);
    }
    
    // reset
    int reset_result = reset(x, pos, n);
    String reset_fix = "";
    for( int i = 0; i < reset_result; i++ )
    {
      reset_fix = reset_fix + '0';
    }
    
    String reset_reverse = str1 + reset_fix + str3;
    String reset_mix = "";
    for( int i = reset_reverse.length()-1; i >= 0; i-- )
    {
      reset_mix = reset_mix + reset_reverse.charAt(i);
    }
    
    // inverse
    int inverse_result = inverse(x, pos, n);
    String inverse_reverse = str1 + inverse_result + str3;
    String inverse_mix = "";
    for( int i = inverse_reverse.length()-1; i >= 0; i-- )
    {
      inverse_mix = inverse_mix + inverse_reverse.charAt(i);
    }
    System.out.printf("x : %d\n", x);
    System.out.printf("pos : %d\n", pos);
    System.out.printf("n : %d\n", n);
    System.out.printf("x                     =  %s\n", Origin);
    System.out.printf("setN( x, pos, n )     =  %s\n", set_mix);
    System.out.printf("resetN( x, pos, n )   =  %s\n", reset_mix);
    System.out.printf("inverseN( x, pos, n ) =  %s\n", inverse_mix);
  }
  
  public static int set( int x, int pos, int n )
  {
    int result = 0;
    
    String Origin = '0' + Integer.toString(x, 2);
        
    String Origin_reverse = "";
    for( int i = Origin.length()-1; i >= 0; i-- )
    {
      Origin_reverse = Origin_reverse + Origin.charAt(i);
    }
    String change = Origin_reverse.substring(pos, pos+n);
    change = "111111";
    result = Integer.parseInt(change);
    
    return result;
  }
  
  public static int reset( int x, int pos, int n )
  {
    int result = 0;
    
    String Origin = '0' + Integer.toString(x, 2);
        
    String Origin_reverse = "";
    for( int i = Origin.length()-1; i >= 0; i-- )
    {
      Origin_reverse = Origin_reverse + Origin.charAt(i);
    }
    String change = Origin_reverse.substring(pos, pos+n);
    change = "000000";
    result = change.length();
    
    return result;
  }
  
  public static int inverse( int x, int pos, int n )
  {
    int result = 0;
    
    String Origin = '0' + Integer.toString(x, 2);
        
    String Origin_reverse = "";
    for( int i = Origin.length()-1; i >= 0; i-- )
    {
      Origin_reverse = Origin_reverse + Origin.charAt(i);
    }
    String change = Origin_reverse.substring(pos, pos+n);
    // System.out.println(change);
    String r_change = "";
    // 값을 뒤집기
    for( int i = change.length()-1; i >= 0; i-- )
    {
      r_change = r_change + change.charAt(i);
    }
    result = Integer.parseInt(r_change);
    
    return result;
  }
  
  
  
}
