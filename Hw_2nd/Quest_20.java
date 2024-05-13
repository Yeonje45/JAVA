import java.util.Scanner;

public class Quest_20 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("요소 수 : ");
  
  // 입력받은 요소의 갯수를 카운트에 저장
  int count_num = sc.nextInt();
  
  // 배열을 요소수 만큼 생성
  int[] num_arr = new int[count_num];
  
  // 요소수 갯수만큼 랜덤값을 넣어주고 출력
  for( int i = 0; i < count_num; i++ )
  {
    num_arr[i] = (int)(Math.random()*99-1)+1;
    System.out.printf("a[%d] : %d\n", i, num_arr[i]);
  }
  
  System.out.print("삽입할 요소의 인덱스 : ");
  int insert_index = sc.nextInt();
  System.out.print("삽입할 값 : ");
  int insert_data = sc.nextInt();
  
  aryIns(num_arr, insert_index, insert_data);
  
  // 스캐너 사용 후 종료
  sc.close();
 }
 
 // aryIns 메서드
 public static void aryIns( int[] a, int idx, int x) 
 {
  for( int i = 0; i < a.length; i++ )
  {
    if( i == idx)
    {
      for( int j = a.length-1; j >= idx; j-- )
      {
        a[j] = a[j-1];
      }
      a[i] = x;
    }
  }
  
  for( int i =0; i < a.length; i++ )
  {
    System.out.printf("a[%d] = %d\n", i, a[i]);
  }
 }
}
