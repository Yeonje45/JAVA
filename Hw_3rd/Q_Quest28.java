public class Q_Quest28
{ 
  public static void main(String[] args)
  {
    numObj1 n1 = new numObj1();
    numObj2 n2 = new numObj2();
    numObj3 n3 = new numObj3();
    
    int a = 1;
    int b = 2;
    double c = 2.4;
    double d = 6.4;
    int e = 3;
    double f = 5.5;
    
    System.out.printf("%d + %d = %d\n", a, b, n1.Add(a, b) );
    System.out.printf("%.1f + %.1f = %.1f\n", c, d, n2.Add(c, d) );
    System.out.printf("%d + %.1f = %.1f\n", e, f, n3.Add(e, f) );
  }
}
