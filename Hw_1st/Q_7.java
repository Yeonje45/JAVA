import java.util.Scanner;

public class Q_7 
{
    public static void main(String[] args) 
    {
     System.out.println("양의 정숫값의 자릿수를 표시합니다.");
     System.out.print("양의 정숫값 : ");
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     String c_number = Integer.toString(number);
     int number_len = c_number.length();

     System.out.printf("입력한 숫자는 %d자리 입니다.\n", number_len);

     sc.close();
    }    
}
