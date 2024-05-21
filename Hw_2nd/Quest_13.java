public class Quest_13 
{
  public static void main(String[] args)
  {
    System.out.println("정수x의 pos번째 비트를 변경합니다.");
    int x = 1431655765;
    int pos = 10;
    
    String origin = '0' + Integer.toString( x,2 );
    
    System.out.println("정수 x의 pos번째 비트를 변경합니다.");
    System.out.println("x : " + x );
    System.out.println("pos : " + pos );
    
    // 문자열 뒤집기 ( 앞자리에 0이 달려있어서 뒤집어서 수정 )
    String origin_reverse = "";
    for( int i = origin.length()-1; i >= 0; i-- )
    {
      origin_reverse = origin_reverse + origin.charAt(i);
    }
    
    //뒤집한 숫자
    String cutting_str1 = origin_reverse.substring(0, pos);
    //뒤집힌 숫자
    String cutting_str3 = origin_reverse.substring(pos+1, 32);
    
    
    // set 메서드 사용
    int set_result = set(x, pos);
    String set_reverse = cutting_str1 + set_result + cutting_str3;
    String set_mix = "";
    
    for( int i = set_reverse.length()-1; i >= 0; i-- )
    {
      set_mix = set_mix + set_reverse.charAt(i);
    }
    
    // reset 메서드 사용
    int reset_result = reset(x, pos);
    String reset_reverse = cutting_str1 + reset_result + cutting_str3;
    String reset_mix="";
    
    for( int i = reset_reverse.length()-1; i >= 0; i-- )
    {
      reset_mix = reset_mix + reset_reverse.charAt(i);
    }
    
    // inverse 메서드 사용
    int inverse_result = inverse(x, pos);
    String inverse_reverse = cutting_str1 + inverse_result + cutting_str3;
    String inverse_mix="";
    
    for( int i = inverse_reverse.length()-1; i >= 0; i-- )
    {
      inverse_mix = inverse_mix + inverse_reverse.charAt(i);
    }
    
    System.out.println("x                 = " + origin );
    System.out.println("set( x, pos )     = " + set_mix );
    System.out.println("reset( x, pos )   = " + reset_mix );
    System.out.println("inverse( x, pos ) = " + inverse_mix );
  }
  
  public static int set( int x, int pos )
  {
    int result = 0;
    
    String origin = '0' + Integer.toString( x, 2 );

    String origin_reverse = "";
    for( int i = origin.length()-1; i >= 0; i-- )
    {
      origin_reverse = origin_reverse + origin.charAt(i);
    }
    String cutting_str2 = origin_reverse.substring(pos, pos+1); //바뀔 자리

    cutting_str2 = "1";
    
    result = Integer.parseInt(cutting_str2);
    
    return result;
  }
  
  public static int reset( int x, int pos )
  {
    int result = 0;
    
    String origin = '0' + Integer.toString( x, 2 );

    String origin_reverse = "";
    for( int i = origin.length()-1; i >= 0; i-- )
    {
      origin_reverse = origin_reverse + origin.charAt(i);
    }
    String cutting_str2 = origin_reverse.substring(pos, pos+1); //바뀔 자리

    cutting_str2 = "0";
    
    result = Integer.parseInt(cutting_str2);
    
    return result;
  }
  
  public static int inverse( int x, int pos )
  {
    int result = 0;
    
    String origin = '0' + Integer.toString( x, 2 );

    String origin_reverse = "";
    for( int i = origin.length()-1; i >= 0; i-- )
    {
      origin_reverse = origin_reverse + origin.charAt(i);
    }
    String cutting_str2 = origin_reverse.substring(pos, pos+1); //바뀔 자리

    String check_str = "0";
    boolean check = cutting_str2.equals(check_str);
    
    if( check == true )
    {
      result = 1;
    }
    else
    {
      result = 0;
    }
    
    return result;
  }
  
  
}
