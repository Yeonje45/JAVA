package main;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
// import javax.swing.table.*;

public class Main extends JFrame
{
  JFrame f;               // 프레임
  JButton btn1, btn2, btn3, btn4, btn5;     // 버튼
  JLabel la;              // 라벨
  JTextArea ta;           // 결과창
  JTextField tf;          // 총 금액창
  
  boolean checkadd = false;
  boolean checkcheck = false;
  
  // 주문목록 창 추가
  String header[] = { "메뉴", "수량", "가격" };
  String contents[][] = {};
  
  DefaultTableModel dtm = new DefaultTableModel( contents, header )
  {
    // 테이블을 더블클릭해도 수정 할 수 없게 설정
    public boolean isCellEditable(int i, int c)
    {
      return false;
    }
  };
    
  
  //JTable table = new JTable( contents, header );
  //JScrollPane scrollPane = new JScrollPane(contentsheader);
  
  JTable table = new JTable(dtm);
  JScrollPane scrollPane = new JScrollPane( table );
  
  
  // 패널
  Coffee coffe;
  Drink drink;
  Cake cake;
  Tea tea;
  
  //
  JPanel ta_bt;
  JPanel bt;  // 기능을 할 버튼들을 붙여줄 패널
  HashMap < String, Integer > menu;   // 메뉴의 정보를 보관할 HashMap 생성
  int total = 0; // 주문급액의 합계를 받을 변수
  public int Order_number = 1; // 오더된 제품의 번호
  
  public Main()
  {   
    f = new JFrame("Starbucks Kiosk - Yoon");   // 프레임명
    ta = new JTextArea("<<메뉴>>\t\t<<가격>>\n");   // 결과창
    ta.setPreferredSize( new Dimension( 700, 20) );    // 결과창의 사이즈
    tf = new JTextField(10);    // 총 합계를 불러줄 텍스트 필드
    btn1 = new JButton("결제");    // 결제버튼
    btn2 = new JButton("취소");    // 취소버튼
    btn3 = new JButton("+");
    btn4 = new JButton("-");
    btn5 = new JButton("clear");
    la = new JLabel("총 금액");    // 총 금액을 나타내는 라벨
    
    // 라벨의 문자열 위치 지정
    la.setHorizontalAlignment( JLabel.CENTER );
    la.setVerticalAlignment( JLabel.CENTER );
    
    // 버튼을 부착할 패널
    bt = new JPanel( new GridLayout(2,3) );
    bt.setPreferredSize( new Dimension( 50, 50 ) );
    bt.setBackground( new Color( 255, 255, 0 ) );
    
    // ta_bt = new JPanel();
    // ta_bt.setPreferredSize( new Dimension( 240, 300) );
    // ta_bt.setBackground( new Color( 255, 255, 255 ) );
    
    
    
    // 메뉴의 정보를 저장할 HashMap 생성
    menu = new HashMap <String, Integer> ();
    coffee_menu();      // 메뉴의 값을 저장할 set변수 실행
    
    // 각 메뉴별 생성자 호출
    coffe = new Coffee(this);
    drink = new Drink(this);
    cake = new Cake(this);
    tea = new Tea(this);
  }
  
  public void addLayout()
  {
    table.getColumn("메뉴").setPreferredWidth( 300 );
    table.getColumn("수량").setPreferredWidth(100);
    table.getColumn("가격").setPreferredWidth(100);
    table.getTableHeader().setReorderingAllowed(false); // 표 이동 불가
    table.getTableHeader().setResizingAllowed(false); // 표 크기 수정불가
    
    //프레임의 레이아웃
    f.setLayout( new BorderLayout() );
    
    // 창 크기 변경불가 설정
    f.setResizable( false );
    
    // 결과값을 출력할 결과창
    //f.add(ta, BorderLayout.BEFORE_LINE_BEGINS);
    f.add( scrollPane );
    // f.add( ta_bt, BorderLayout.EAST );
    
    // ta_bt.add( btn3, BorderLayout.WEST );
    // ta_bt.add( btn4, BorderLayout.WEST );
    // ta_bt.add( btn5, BorderLayout.SOUTH );
    // ta_bt.add(btn4, BorderLayout.EAST );
    // ta_bt.add(btn5, BorderLayout.AFTER_LINE_ENDS);
    
    //패널들을 결합시킬 Tabbed pane 생성
    JTabbedPane tab = new JTabbedPane();
    
    //패널부착
    tab.addTab("커    피", coffe );
    tab.addTab("음    료", drink );
    tab.addTab("케 이 크", cake );
    tab.addTab("피지오/차", tea );
    
    //탭 부착위치 지정
    f.add( tab, BorderLayout.BEFORE_FIRST_LINE );
    // tab.add(btn3, BorderLayout.CENTER);
    
    // f.add( btn3, BorderLayout.AFTER_LINE_ENDS );
    // f.add( btn4, BorderLayout.EAST );
    // f.add( btn5, BorderLayout.EAST );
   
    //기능을 하는 버튼 및 주문 금액의 합계를 띄울 텍스트 필드를 bt패널에 부착
    bt.add(btn4);
    bt.add(btn3);
    // bt.add(btn5);
    
    bt.add(tf);
    bt.add(btn1);
    bt.add(btn2);
    bt.add(la);
    
    
    // 패널 부착위치 지정
    f.add( bt, BorderLayout.SOUTH );
    
    
    //키오스크창 사이즈 지정, 시각화, 종료버튼활성
    f.setBounds( 50, 50, 700, 900 );
    f.setVisible(true);
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
  
  
  public void eventProc()
  {
    btn1.addActionListener( new ActionListener() 
    {
      @Override
      public void actionPerformed( ActionEvent e )
      {
        
        if( total == 0 )
        {
          JOptionPane.showMessageDialog( null, "주문할 목록이 없습니다." );
        }
        else
        {
          // 확인버튼생성
          int dialogButton = JOptionPane.showConfirmDialog( null, "결재하시겠습니까?", "결제창", JOptionPane.YES_NO_OPTION);
          
          if( dialogButton == JOptionPane.YES_OPTION)
          {            
            JOptionPane.showMessageDialog( null, "주문번호 "+ Order_number + " 결제가 완료되었습니다. " );
            Order_number++;
              
            
            for( int i = dtm.getRowCount()-1; i >= 0; i-- )
            {
              dtm.removeRow(i);
            }
            table.updateUI();
            total = 0;
            tf.setText( String.valueOf( total ) + "원" );
              
            // total = 0;
            // ta.setText("<<메뉴>>\t\t<<가격>>\n");
            // tf.setText(String.valueOf(0));
          } 
        }        
        
      }
    });
    
    btn2.addActionListener( new ActionListener() 
    {
      @Override
      public void actionPerformed ( ActionEvent e )
      {
        for( int i = dtm.getRowCount()-1; i >= 0; i-- )
        {
          dtm.removeRow(i);
        }
        
        // int qnum = dtm.getRowCount();
        // dtm.removeRow( qnum-1 );
        
        table.updateUI();
  
        total = 0;
        tf.setText( String.valueOf( total ) + "원" );
      }
      
    });
    
    // 선택행 증가
    btn3.addActionListener( new ActionListener() 
    {
      @Override
      public void actionPerformed ( ActionEvent e )
      {
        int rownum = table.getSelectedRow();
        int menucount = (int)table.getValueAt( rownum, 1 );
        int menumoney = (int)table.getValueAt( rownum, 2 );
        menucount++;
        total += menumoney;
        table.setValueAt(menucount, rownum, 1);
        
        
        // Total 금액 다시계산
        int check_total = 0;
        for( int i = 0; i < table.getRowCount(); i++ )
        {
          check_total += ((int)table.getValueAt( i, 1) * (int)table.getValueAt( i, 2));
        }
        // System.out.println(check_total);
        total = check_total;
        tf.setText( String.valueOf( total ) + "원" );
        // System.out.println( rownum );
      }
      
    });
    
    // 선택행 감소
    btn4.addActionListener( new ActionListener() 
    {
      @Override
      public void actionPerformed ( ActionEvent e )
      {
        int rownum = table.getSelectedRow();
        int menucount = (int)table.getValueAt( rownum, 1 );
        int menumoney = (int)table.getValueAt( rownum, 2 );
        
        if( menucount > 1 )
        {
          menucount--;
          total -= menumoney;
        }
        else
        {
          menucount = 1;
        }
        table.setValueAt(menucount, rownum, 1);
        
        
        // Total 금액 다시계산
        int check_total = 0;
        for( int i = 0; i < table.getRowCount(); i++ )
        {
          check_total += ((int)table.getValueAt( i, 1) * (int)table.getValueAt( i, 2));
        }
        // System.out.println(check_total);
        total = check_total;
        tf.setText( String.valueOf( total ) + "원" );
        
        
        
        // System.out.println( rownum );
      }
      
    });
  }
  
  void coffee_menu()
  {
    menu.put("아메리카노", 3000 );
    menu.put("에스프레소", 3000 );
    menu.put("카페모카", 3800 );
    menu.put("카페라떼", 3900 );
    menu.put("카라멜마키아또", 4200 );
    menu.put("자바칩프라푸치노", 4300 );
    menu.put("화이트초콜릿모카", 4400 );
    menu.put("돌체라떼", 4100 );
    menu.put("딸기딜라이트요거트", 4800 );
    menu.put("딸기콜드폼초콜릿", 4700 );
    menu.put("망고바나나블랜디드", 4700 );
    menu.put("스타벅스슬래머", 4600 );
    menu.put("제주까망라떼", 4900 );
    menu.put("딸기아사이레모네이드", 5100 );
    menu.put("망고용과레모네이드", 5100 );
    menu.put("여수바다유자블랜디드", 5300 );
    menu.put("레드벨벳크림치즈", 5100 );
    menu.put("딸기초코쏙생크림", 5200 );
    menu.put("멘지락쑥판생크림", 4900 );
    menu.put("7레이어가나슈", 5000 );
    menu.put("클라우드치즈", 4700 );
    menu.put("촉촉초콜릿생크림", 4900 );
    menu.put("당근현무암", 5300 );
    menu.put("새코롬한라봉크림", 5400 );
    menu.put("민트블랜드티", 3700 );
    menu.put("얼그레이티", 3400 );
    menu.put("캐모마일블랜드티", 3600 );
    menu.put("히비스커스블랜드티", 3800 );
    menu.put("제주말차라떼", 3900 );
    menu.put("제주유기농녹차티", 3500 );
    menu.put("클래식밀크티", 3400 );
    menu.put("차이티라떼", 3700 );
  }
  
  public static void main(String[] args)
  {
    Main main = new Main(); // 메인생성자 호출
    main.addLayout();
    main.eventProc();
  }
}
